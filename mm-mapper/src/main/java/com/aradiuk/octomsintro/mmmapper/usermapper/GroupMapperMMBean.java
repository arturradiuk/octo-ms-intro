package com.aradiuk.octomsintro.mmmapper.usermapper;

import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.dto.GroupSimpleDto;
import com.aradiuk.octomsintro.inframapper.GroupMapper;
import com.aradiuk.octomsintro.model.Group;
import org.springframework.stereotype.Component;

@Component
class GroupMapperMMBean implements GroupMapper {
    @Override
    public Group map(GroupDto groupDto) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GroupDto map(Group group) {
        throw new UnsupportedOperationException();
    }

    @Override
    public GroupSimpleDto mapToSimple(Group group) {
        throw new UnsupportedOperationException();
    }
}
