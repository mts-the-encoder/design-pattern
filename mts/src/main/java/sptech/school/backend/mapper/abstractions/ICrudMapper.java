package sptech.school.backend.mapper.abstractions;

import sptech.school.backend.dto.base.BaseDTO;
import sptech.school.backend.entities.base.BaseEntity;

public interface ICrudMapper<DTO extends BaseDTO, Entity extends BaseEntity> {

    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);
}
