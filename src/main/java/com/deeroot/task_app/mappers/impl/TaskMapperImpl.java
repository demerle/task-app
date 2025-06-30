package com.deeroot.task_app.mappers.impl;

import com.deeroot.task_app.domain.dto.TaskDto;
import com.deeroot.task_app.domain.entities.Task;
import com.deeroot.task_app.mappers.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    public TaskDto toDto(Task task) {
        return new TaskDto(task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getStatus(),
                task.getPriority());
    }

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(taskDto.id(),
                taskDto.title(),
                taskDto.description(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null,
                null,
                null);
    }
}
