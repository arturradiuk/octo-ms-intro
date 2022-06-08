package com.aradiuk.octomsintro.msmapper.groupmapper;

import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.dto.GroupSimpleDto;
import com.aradiuk.octomsintro.inframapper.GroupMapper;
import com.aradiuk.octomsintro.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
class GroupMapperMSBean implements GroupMapper {
    private final GroupMapperMS mapperMS;

    @Autowired
    public GroupMapperMSBean(GroupMapperMS mapperMS) {
        this.mapperMS = mapperMS;
    }

    @Override
    public Group map(GroupDto groupDto) {
        return mapperMS.map(groupDto);
    }

    @Override
    public GroupDto map(Group group) {
        return mapperMS.map(group);
    }

    @Override
    public GroupSimpleDto mapToSimple(Group group) {
        return mapperMS.mapToSimple(group);
    }
}
