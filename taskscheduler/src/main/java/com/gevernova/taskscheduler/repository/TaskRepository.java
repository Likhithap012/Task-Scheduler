package com.gevernova.taskscheduler.repository;

import com.gevernova.taskscheduler.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
