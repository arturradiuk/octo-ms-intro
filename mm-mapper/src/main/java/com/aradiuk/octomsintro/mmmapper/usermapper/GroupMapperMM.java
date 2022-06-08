package com.aradiuk.octomsintro.mmmapper.usermapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupMapperMM {
    @Bean
    public ModelMapper groupMapper() {
        return new ModelMapper();
    }
}
