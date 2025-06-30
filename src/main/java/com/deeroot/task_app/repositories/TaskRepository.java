package com.deeroot.task_app.repositories;

import com.deeroot.task_app.domain.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
import java.util.List;
@Repository
public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskListId(UUID taskListId);
    Optional<Task> findByTaskIdAndId(UUID taskListId, UUID id);
}
