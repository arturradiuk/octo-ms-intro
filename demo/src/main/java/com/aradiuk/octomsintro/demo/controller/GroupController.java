package com.aradiuk.octomsintro.demo.controller;

import com.aradiuk.octomsintro.demo.repository.GroupRepository;
import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.dto.GroupSimpleDto;
import com.aradiuk.octomsintro.inframapper.GroupMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/groups")
class GroupController {
    private final GroupMapper groupMapper;
    private final GroupRepository groupRepository;

    GroupController(GroupMapper groupMapper, GroupRepository groupRepository) {
        this.groupMapper = groupMapper;
        this.groupRepository = groupRepository;
    }

    @GetMapping
    List<GroupDto> getAllGroups() {
        return groupRepository.getAllGroups().stream().map(groupMapper::map).toList();
    }

    @GetMapping("random")
    GroupDto getRandomGroup() {
        return groupMapper.map(groupRepository.getRandomGroup());
    }


    @GetMapping("simple")
    List<GroupSimpleDto> getAllSimpleGroups() {
        return groupRepository.getAllGroups().stream().map(groupMapper::mapToSimple).toList();
    }

    @GetMapping("simple/random")
    GroupSimpleDto getRandomSimpleGroup() {
        return groupMapper.mapToSimple(groupRepository.getRandomGroup());
    }


}
