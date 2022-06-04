package com.aradiuk.octomsintro.dto;

public class UserBaseInfoDto {
    private String username;
    private String firstName;
    private String secondName;

    public UserBaseInfoDto() {
    }

    public UserBaseInfoDto(String username, String firstName, String secondName) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}

//public record UserBaseInfoDto(String username, String firstName, String secondName) {
//
//}