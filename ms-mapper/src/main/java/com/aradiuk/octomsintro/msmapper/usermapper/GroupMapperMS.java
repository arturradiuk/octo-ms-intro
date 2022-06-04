package com.aradiuk.octomsintro.msmapper.usermapper;

import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.model.Group;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GroupMapperMS {
    Group map(GroupDto groupDto);
    GroupDto map(Group group);
}
