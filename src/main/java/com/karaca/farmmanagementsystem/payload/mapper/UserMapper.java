package com.karaca.farmmanagementsystem.payload.mapper;


import com.karaca.farmmanagementsystem.entity.user.User;
import com.karaca.farmmanagementsystem.payload.request.abstracts.BaseUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class UserMapper {


    public User mapUserRequestToUser(BaseUserRequest userRequest, String userRole){

        User user = User.builder()
                .username(userRequest.getUsername())
                .name(userRequest.getName())
                .buildIn(userRequest.getBuildIn())
                .surname(userRequest.getSurname())
                .password(userRequest.getPassword())
                .phoneNumber(userRequest.getPhoneNumber())
                .email(userRequest.getEmail())
                .birthDay(userRequest.getBirthDay())
                .build();

return user;





    }





    }

