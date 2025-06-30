package com.deeroot.task_app.mappers;

import com.deeroot.task_app.domain.dto.TaskListDto;
import com.deeroot.task_app.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
