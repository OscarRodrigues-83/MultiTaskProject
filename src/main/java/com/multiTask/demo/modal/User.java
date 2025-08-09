package com.multiTask.demo.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.multiTask.demo.board.WhiteBoard;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "Usuario")
public class User {
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WhiteBoard> boardList = new ArrayList<>();
    private String userName;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int age;
    private LocalDate birth_date;


    public User(long id, String userName, String email, LocalDate birth_date) {

        this.userName = userName;
        this.id = id;
        this.email = email;
        this.age = Period.between(birth_date, LocalDate.now()).getYears();
        this.birth_date = birth_date;
    }

}
