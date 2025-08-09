package com.multiTask.demo.board;

import java.util.ArrayList;
import java.util.List;

import com.multiTask.demo.entities.User;
import com.multiTask.demo.task.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WhiteBoard {
    @ManyToOne
    @JoinColumn(name = "user_id")

    private User user;

    @OneToMany(mappedBy = "whiteBoard", cascade = CascadeType.ALL, orphanRemoval = true)

    private List<Task> taskList = new ArrayList<>();
    private String boardName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

}
