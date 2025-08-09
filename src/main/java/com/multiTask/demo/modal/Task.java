package com.multiTask.demo.task;

import com.multiTask.demo.board.WhiteBoard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Task {
    private String description;
    private String status;
    private String taskName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn( name = "whiteboard_ID")
    private WhiteBoard whiteBoard;

    public Task(String taskName, String description, long id) {
        this.description = description;
        this.taskName = taskName;
        this.id = id;
        this.status = "PENDENTE";
    }


}
