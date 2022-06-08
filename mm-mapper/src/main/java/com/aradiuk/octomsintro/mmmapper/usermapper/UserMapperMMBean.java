package com.aradiuk.octomsintro.mmmapper.usermapper;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.dto.UserDto;
import com.aradiuk.octomsintro.inframapper.UserMapper;
import com.aradiuk.octomsintro.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserMapperMMBean implements UserMapper {
    private final ModelMapper userMapper;

    @Autowired
    UserMapperMMBean(ModelMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User mapToBase(UserBaseInfoDto userBaseInfoDto) {
        return userMapper.map(userBaseInfoDto, User.class);
    }

    @Override
    public UserBaseInfoDto mapToBase(User user) {
        return userMapper.map(user, UserBaseInfoDto.class);
    }

    @Override
    public UserDto map(User user) {
        return userMapper.map(user, UserDto.class);
    }
}
