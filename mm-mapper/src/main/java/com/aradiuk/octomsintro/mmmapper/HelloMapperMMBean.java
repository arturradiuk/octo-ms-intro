package com.aradiuk.octomsintro.mmmapper;

import com.aradiuk.octomsintro.inframapper.HelloMapper;
import org.springframework.stereotype.Component;

@Component
class HelloMapperMMBean implements HelloMapper {

    @Override
    public String map() {
        return "Hello from ModelMapper";
    }
}
