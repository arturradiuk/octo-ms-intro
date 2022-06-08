package com.aradiuk.octomsintro.demo;

import com.aradiuk.octomsintro.dto.UserBaseInfoDto;
import com.aradiuk.octomsintro.inframapper.UserMapper;
import com.aradiuk.octomsintro.model.User;
import org.assertj.core.api.Assertions;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {

    private final EasyRandom easyRandom;
    @Autowired
    private UserMapper userMapper;

    UserMapperTest() {
        easyRandom = new EasyRandom();
    }

    @Test
    void givenUser_whenMapCalled_thenUserBaseInfoDto() {
        //given
        User randomUser = easyRandom.nextObject(User.class);

        //when
        UserBaseInfoDto mappedDto = userMapper.mapToBase(randomUser);

        //then
        Assertions.assertThat(randomUser.getFirstName()).isEqualTo(mappedDto.getFirstName());
        Assertions.assertThat(randomUser.getSecondName()).isEqualTo(mappedDto.getSecondName());
        Assertions.assertThat(randomUser.getUsername()).isEqualTo(mappedDto.getUsername());
    }

    @Test
    void givenUser_whenMapCalled_thenUserBaseInfoDto_PERFORMANCE() {
        //given
        User randomUser = easyRandom.nextObject(User.class);

        //when
        StopWatch stopWatch = StopWatch.instance();
        stopWatch.start();

        for (int i = 0; i < 10_000_000; i++) {
            UserBaseInfoDto mappedDto = userMapper.mapToBase(randomUser);
            // 1_000_000_000: ms = 8821 millis. mm = infinity
            // 10_000_000: ms = 109 millis millis. mm = 7496 millis
        }

        stopWatch.stop();
        System.out.println("""
                                   givenUser_whenMapCalled_thenUserBaseInfoDto_PERFORMANCE - finished after
                                   """ + stopWatch.watch() + " millis");
    }

    @Test
    void mapperIsNotNull() {
        Assertions.assertThat(userMapper).isNotNull();
    }
}
