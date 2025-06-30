package com.deeroot.task_app.domain;

import com.deeroot.task_app.domain.entities.TaskList;
import com.deeroot.task_app.domain.entities.TaskPriority;
import com.deeroot.task_app.domain.entities.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private TaskPriority priority;
    private TaskStatus status;
    private LocalDateTime created;
    private LocalDateTime updated;
    private TaskList taskList;

}
