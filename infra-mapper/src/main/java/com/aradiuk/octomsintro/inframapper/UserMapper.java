package com.aradiuk.octomsintro.inframapper;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.model.User;

public interface UserMapper {
    User map(UserBaseInfoDto userBaseInfoDto);

    UserBaseInfoDto map(User user);
}
