package com.aradiuk.octomsintro.dto;


import java.time.LocalDateTime;
import java.util.List;

public class GroupDto {
    private String uuid;
    private String creationDateTime;
    private LocalDateTime lastUpdateDateTime;
    private char[] description;
    private List<UserDto> users; // cyclic reference
    private String active;
    private UserDto userDtoOwner;
    private String royalty;
}
