package com.luv2code;

import com.luv2code.domain.Task;
import com.luv2code.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1L, "Create Spring Boot App", LocalDate.now(), true));
            taskService.save(new Task(1L, "Create Spring Project Packages", LocalDate.now().plus(1, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Create JS Angular App", LocalDate.now(), true));
            taskService.save(new Task(1L, "Run Spring Boot App", LocalDate.now().plus(8, ChronoUnit.DAYS), false));
            taskService.save(new Task(1L, "Write Some Blog Posts", LocalDate.now(), false));
            taskService.save(new Task(1L, "Create Vanilla JS App", LocalDate.now().plus(10, ChronoUnit.MONTHS), true));
            taskService.save(new Task(1L, "Finish Coding Train Challenges", LocalDate.now(), true));
            taskService.save(new Task(1L, "Watch Coding Train Particle System", LocalDate.now(), false));
        };
    }

}
