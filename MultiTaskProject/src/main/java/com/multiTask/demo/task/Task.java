package com.multiTask.demo.task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    private String description;
    private String status;
    private String taskName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Task() {
    }

    public Task(String taskName, String description, long id) {
        this.description = description;
        this.taskName = taskName;
        this.id = id;
        this.status = "PENDENTE";
    }

    public Task(String description, String taskName) {
        this.description = description;
        this.status = "PENDENTE";
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getTaskName() {
        return taskName;
    }

    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setId(long id) {
        this.id = id;
    }

}
