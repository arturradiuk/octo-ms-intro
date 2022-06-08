package com.aradiuk.octomsintro.inframapper;

import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.dto.GroupSimpleDto;
import com.aradiuk.octomsintro.model.Group;

public interface GroupMapper {
    Group map(GroupDto groupDto);

    GroupDto map(Group group);

    GroupSimpleDto mapToSimple(Group group);
}
