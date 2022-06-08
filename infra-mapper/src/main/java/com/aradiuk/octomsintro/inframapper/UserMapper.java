package com.aradiuk.octomsintro.inframapper;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.dto.UserDto;
import com.aradiuk.octomsintro.model.User;

public interface UserMapper {
    User mapToBase(UserBaseInfoDto userBaseInfoDto);

    UserBaseInfoDto mapToBase(User user);

    UserDto map(User user);

}
