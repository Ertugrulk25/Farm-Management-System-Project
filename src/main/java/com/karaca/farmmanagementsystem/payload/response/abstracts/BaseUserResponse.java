package com.karaca.farmmanagementsystem.payload.response.abstracts;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.karaca.farmmanagementsystem.entity.user.UserRole;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class BaseUserResponse {

    private Long id;

    private String username;

    private String name;

    private String surname;

    private String phoneNumber;

    private String email;

    private LocalDate birthDay;

    private UserRole userRole;
}
