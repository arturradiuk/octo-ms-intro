package com.aradiuk.octomsintro.msmapper.usermapper;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.model.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses =
        {GroupMapperMS.class}, unmappedTargetPolicy = ReportingPolicy.ERROR)
interface UserMapperMS {
    UserMapperMS INSTANCE = Mappers.getMapper(UserMapperMS.class); // only for test purposes if
    // using with IoC container

    @Mapping(target = "username", source = "username")
    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "secondName", source = "secondName")
    @Mapping(target = "id", ignore = true)
    // to ignore warning "warning: Unmapped target properties: "id, userType"."
    @Mapping(target = "userType", ignore = true)
    User map(UserBaseInfoDto userBaseInfoDto);

    @InheritInverseConfiguration
    UserBaseInfoDto map(User user);
}
