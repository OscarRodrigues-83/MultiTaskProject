package com.multiTask.demo.task;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public Task getTaskById(long id) {
        return taskRepository.getReferenceById(id);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Boolean deleteTaskById(long id){
       if(taskRepository.existsById(id)) {
        taskRepository.deleteById(id);
       }
       return false;
    }
    

}
