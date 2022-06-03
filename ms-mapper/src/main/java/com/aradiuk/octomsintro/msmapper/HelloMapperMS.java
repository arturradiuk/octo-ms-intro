package com.aradiuk.octomsintro.msmapper;

import com.aradiuk.octomsintro.inframapper.HelloMapper;
import org.springframework.stereotype.Component;

@Component
public class HelloMapperMS implements HelloMapper {

    @Override
    public String map() {
        return "Hello from MapStruct";
    }
}
