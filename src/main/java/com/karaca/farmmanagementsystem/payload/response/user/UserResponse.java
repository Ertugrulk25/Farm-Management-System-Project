package com.karaca.farmmanagementsystem.payload.response.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.karaca.farmmanagementsystem.payload.response.abstracts.BaseUserResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse extends BaseUserResponse {


}
