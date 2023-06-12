package com.example.simpleproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Valid
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private Integer id;
    @NotBlank(message = "First Name cannot be null or empty")
    private String firstname;
    @NotBlank(message = "Last Name cannot be null or empty")
    private String lastname;
    @NotBlank(message = "Middle Name cannot be null or empty")
    private String middleName;
    private String username;
    private String borrowName;
    private String phoneNumber;
    private String passportSeries;
    private String firstAddress;
    private String secondAddress;
    private Double monthlyPrice;
    private Integer imageId;
    private Integer employeesId;
    private LocalDateTime birthdate;
    private LocalTime workingTimeStart;
    private LocalTime workingTimeEnd;
    private LocalDate workingDaysStart;
    private LocalDate workingDaysEnd;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
