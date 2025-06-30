package com.deeroot.task_app.mappers.impl;

import com.deeroot.task_app.domain.dto.TaskListDto;
import com.deeroot.task_app.domain.entities.Task;
import com.deeroot.task_app.domain.entities.TaskList;
import com.deeroot.task_app.domain.entities.TaskStatus;
import com.deeroot.task_app.mappers.TaskListMapper;
import com.deeroot.task_app.mappers.TaskMapper;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;


@Component
public class TaskListMapperImpl implements TaskListMapper {

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(
                taskListDto.id(),
                taskListDto.title(),
                taskListDto.description(),
                Optional.ofNullable(taskListDto.tasks())
                        .map(tasks -> tasks.stream()
                                .map(taskMapper::fromDto)
                                .toList()
                        ).orElse(null),
                null,
                null
        );
    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return new TaskListDto(
                taskList.getId(),
                taskList.getTitle(),
                taskList.getDescription(),
                Optional.ofNullable(taskList.getTasks()).map(List::size).orElse(0),
                calculateTaskListProgress(taskList.getTasks()),
                Optional.ofNullable(taskList.getTasks())
                        .map(list -> list.stream()
                                .map(taskMapper::toDto)
                                .toList()
                        ).orElse(null)
        );
    }


    private Double calculateTaskListProgress(List<Task> tasks){
        if (tasks == null){
            return null;
        }

        Long closedTaskCount = tasks.stream()
                .filter(task -> task.getStatus() == TaskStatus.CLOSED)
                .count();

        return (double) closedTaskCount / tasks.size();
    }


}
