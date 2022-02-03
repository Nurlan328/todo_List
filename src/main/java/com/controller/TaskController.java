package com.controller;

import com.model.Task;
import com.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;
    private final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @PostMapping("/insertTask")
    public Task insertTask(@RequestBody Task task) {
        logger.info("inserting new Task");
        return taskService.insertTask(task);
    }

    @GetMapping("/getAllTasks")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PutMapping("/updateTask")
    public Task updateTask(@RequestBody Task task) {
        System.out.println("updating");
        return taskService.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTask(@PathVariable int id) {
        return taskService.deleteTask(id);
    }




}
