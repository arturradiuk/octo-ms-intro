package com.aradiuk.octomsintro.mmmapper.usermapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserMapperMM {
    @Bean
    public ModelMapper userMapper(){
        return new ModelMapper();
    }
}
