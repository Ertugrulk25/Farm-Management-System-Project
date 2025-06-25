package com.karaca.farmmanagementsystem.payload.request.abstracts;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.websocket.OnOpen;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseUserRequest extends AbstractUserRequest{

    @NotNull(message = "please enter your password")
    @Size(min = 8, max = 12, message = "your password shell be 8-20 characters")
    private String password;

    private Boolean buildIn=false;
}
