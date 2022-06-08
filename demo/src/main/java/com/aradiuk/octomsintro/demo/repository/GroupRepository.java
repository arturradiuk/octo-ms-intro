package com.aradiuk.octomsintro.demo.repository;

import com.aradiuk.octomsintro.model.Group;
import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GroupRepository {
    public List<Group> getAllGroups() {
        EasyRandom easyRandom = new EasyRandom();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            groups.add(easyRandom.nextObject(Group.class));
        }
        return groups;
    }

    public Group getRandomGroup() {
        EasyRandom easyRandom = new EasyRandom();
        return easyRandom.nextObject(Group.class);
    }
}
