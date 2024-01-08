package ru.garipov.kursa4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STAFF")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "appointment")
    private String appointment;

    // Измените тип поля на String
    @Column(name = "phonenumber")
    private String phoneNumber;


    @Column(name = "email") // Добавляем поле для email
    private String email;

    // Геттер для поля email
    public String getEmail() {
        return email;
    }

    // Сеттер для поля email
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "user_email") // New field for user email
    private String userEmail;

    @Column(name = "created_by")
    private String createdBy;


    // Сеттер для поля createdBy
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    // Сеттер для поля userEmail
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }



}
