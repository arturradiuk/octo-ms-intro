package com.aradiuk.octomsintro.demo.repository;

import com.aradiuk.octomsintro.model.Group;
import com.aradiuk.octomsintro.model.User;
import org.jeasy.random.EasyRandom;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> getAllUsers() {
        EasyRandom easyRandom = new EasyRandom();
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add(easyRandom.nextObject(User.class));
        }
        return users;
    }

    public User getRandomUser() {
        EasyRandom easyRandom = new EasyRandom();
        User user = easyRandom.nextObject(User.class);
        user.setUsername("aradiuk");
        Group group = easyRandom.nextObject(Group.class);
        group.setGroupName("First group");
        user.setGroup(group);
        return user;
    }
}
