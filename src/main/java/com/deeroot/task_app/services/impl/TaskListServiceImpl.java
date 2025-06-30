package com.deeroot.task_app.services.impl;

import com.deeroot.task_app.domain.dto.TaskDto;
import com.deeroot.task_app.domain.entities.TaskList;
import com.deeroot.task_app.repositories.TaskListRepository;
import com.deeroot.task_app.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

    private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
