package com.aradiuk.octomsintro.msmapper.usermapper;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.dto.UserDto;
import com.aradiuk.octomsintro.inframapper.UserMapper;
import com.aradiuk.octomsintro.model.User;
import com.aradiuk.octomsintro.msmapper.CycleAvoidingMappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class UserMapperMSBean implements UserMapper {
    private final UserMapperMS mapperMS;

    @Autowired
    public UserMapperMSBean(UserMapperMS mapperMS) {
        this.mapperMS = mapperMS;
    }

    @Override
    public User mapToBase(
            UserBaseInfoDto userBaseInfoDto) { // there was no need to wrap UserMapperMS
        // in UserMapperMSImpl we could just extend UserMapperMs with UserMapper
        // such implementation was made only to follow my convention in two project
        return mapperMS.map(userBaseInfoDto);
    }

    @Override
    public UserBaseInfoDto mapToBase(User user) {
        return mapperMS.mapToBase(user);
    }

    @Override
    public UserDto map(User user) {
        return mapperMS.map(user, new CycleAvoidingMappingContext());
    }
}
