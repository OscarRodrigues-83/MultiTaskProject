package com.multiTask.demo.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    private String userName;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int age;
    private LocalDate birth_date;

    public User() {
    }
    public User(String userName, String email, LocalDate birth_date) {
        this.userName = userName;
        this.email = email;
        this.age = Period.between(LocalDate.now(), birth_date).getYears();
        this.birth_date = birth_date;
    }

    public User(long id, String userName, String email, LocalDate birth_date) {

        this.userName = userName;
        this.id = id;
        this.email = email;
        this.age = Period.between(LocalDate.now(), birth_date).getYears();
        this.birth_date = birth_date;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ userName= " + userName + ", email = " + email + ", id = " + id + ", age = " + age + ", birth_date = "
         + birth_date + " }";
    }

    public String getuserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

}
