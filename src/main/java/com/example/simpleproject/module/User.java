package com.example.simpleproject.module;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "users_seq")
    @SequenceGenerator(name = "users_seq",sequenceName = "users_seq",allocationSize = 1)
    private Integer id;
    private String firstname;
    private String lastname;
    @Column(name = "middle_name")
    private String middleName;
    private String username;
    @Column(name = "borrow_name")
    private String borrowName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "passport_series")
    private String passportSeries;
    @Column(name = "first_address")
    private String firstAddress;
    @Column(name = "second_address")
    private String secondAddress;
    @Column(name = "monthly_price")
    private Double monthlyPrice;
    @Column(name = "image_id")
    private Integer imageId;
    @Column(name = "employees_id")
    private Integer employeesId;
    private LocalDateTime birthdate;
    @Column(name = "working_time_start")
    private LocalTime workingTimeStart;
    @Column(name = "working_time_end")
    private LocalTime workingTimeEnd;
    @Column(name = "working_days_start")
    private LocalDate workingDaysStart;
    @Column(name = "working_days_end")
    private LocalDate workingDaysEnd;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}