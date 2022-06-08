package com.aradiuk.octomsintro.msmapper.groupmapper;

import com.aradiuk.octomsintro.dto.GroupDto;
import com.aradiuk.octomsintro.dto.GroupSimpleDto;
import com.aradiuk.octomsintro.model.Group;
import com.aradiuk.octomsintro.msmapper.CycleAvoidingMappingContext;
import org.mapstruct.*;

import java.util.UUID;

@Mapper(componentModel = "spring",
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        imports = UUID.class, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface GroupMapperMS {
    @Mapping(target = "id", expression = "java(UUID.fromString(groupDto.getUuid()))")
    @Mapping(target = "active", ignore = true)
    @Mapping(target = "owner", ignore = true)
    @Mapping(target = "royalty", ignore = true)
    Group map(GroupDto groupDto);


    @Mapping(target = "lastUpdateDateTime", dateFormat = "dd.yyyy.MM")
    @Mapping(target = "creationDateTime", dateFormat = "yyyy.MM.dd")
    @Mapping(target = "uuid", expression = "java(uuidToString(group.getId()))")
    @Mapping(target = "description", expression = "java(group.getDescription().toCharArray())")
    GroupDto map(Group group, @Context CycleAvoidingMappingContext cycleAvoidingMappingContext);

    @Mapping(target = "active", expression = "java((\"IS_\"+group.isActive()).toUpperCase())")
    @Mapping(target = "id", source = "id", qualifiedByName = "CategoryToString")
    @Mapping(target = "ownerUsername", source = "owner.username")
    GroupSimpleDto mapToSimple(Group group);

    @Named("CategoryToString")
    default String uuidToString(UUID uuid) {
        return uuid.toString().replace("-", "");
    }

    default String map(char[] value) {
        return new String(value);
    }

    default char[] map(String value) {
        return value.toCharArray();
    }
}
