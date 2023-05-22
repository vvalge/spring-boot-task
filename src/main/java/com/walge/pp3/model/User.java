package com.walge.pp3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

@Data
@Entity
@Component
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 40, message = "Имя должно содержать от 2 до 40 символов")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2, max = 40, message = "Фамилия должна содержать от 2 до 40 символов")
    private String surname;

    @Column(name = "age")
    @Min(value = 0, message = "Возраст должен быть больше 0")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Поле не может быть пустым")
    @Email(message = "Неверный формат")
    private String email;
}
