package com.luv2code.service;

import com.luv2code.domain.Task;
import com.luv2code.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    @Autowired // unecessary in Spring 3+
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
