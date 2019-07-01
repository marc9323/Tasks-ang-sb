package com.luv2code.service;

import com.luv2code.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
