package com.multiTask.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiTask.demo.modal.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

    
} 