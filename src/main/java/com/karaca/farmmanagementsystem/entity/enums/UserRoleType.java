package com.karaca.farmmanagementsystem.entity.enums;

public enum UserRoleType {

    FARMER("Boss"),
    EMPLOYEE("Worker"),
    ADMIN("Developer");


    public final String name;

    UserRoleType(String name) {
        this.name=name;
    }
}
