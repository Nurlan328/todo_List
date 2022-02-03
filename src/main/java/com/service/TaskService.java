package com.service;

import com.example.model.Task;
import com.example.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

//    Post
    public Task insertTask(Task task) {
        return taskRepository.save(task);
    }

//  Get
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

//    Put

    public Task updateTask(Task task) {
        System.out.println("updating");
        Task task1 = taskRepository.findById(task.getId()).orElse(null);
        task1.setName(task.getName());
        task1.setDescription(task.getDescription());
        task1.setStatus(task.getStatus());
        return taskRepository.save(task1);
    }

//    Delete
    public String deleteTask(int id) {
        taskRepository.deleteById(id);
        return "Task with id " + id + " has been deleted";
    }

}
