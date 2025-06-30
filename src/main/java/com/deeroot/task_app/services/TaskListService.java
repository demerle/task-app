package com.deeroot.task_app.services;

import com.deeroot.task_app.domain.dto.TaskDto;
import com.deeroot.task_app.domain.entities.Task;
import com.deeroot.task_app.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
