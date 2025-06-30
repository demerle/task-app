package com.deeroot.task_app.mappers;

import com.deeroot.task_app.domain.dto.TaskDto;
import com.deeroot.task_app.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);
}
