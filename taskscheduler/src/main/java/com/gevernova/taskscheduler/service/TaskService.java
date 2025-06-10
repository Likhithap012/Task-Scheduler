package com.gevernova.taskscheduler.service;

import com.gevernova.taskscheduler.dto.TaskRequestDTO;
import com.gevernova.taskscheduler.dto.TaskResponseDTO;

import java.util.List;

public interface TaskService {

    TaskResponseDTO createTask(TaskRequestDTO dto);

    List<TaskResponseDTO> getAllTasks();

    TaskResponseDTO getTaskById(Long id);

    TaskResponseDTO updateTask(Long id, TaskRequestDTO dto);

    void deleteTask(Long id);
}
