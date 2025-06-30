package com.deeroot.task_app.domain.dto;

import com.deeroot.task_app.domain.entities.TaskList;
import com.deeroot.task_app.domain.entities.TaskPriority;
import com.deeroot.task_app.domain.entities.TaskStatus;


import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto (
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskStatus status,
        TaskPriority priority
    )
{
}
