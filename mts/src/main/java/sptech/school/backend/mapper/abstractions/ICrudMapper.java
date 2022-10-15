package sptech.school.backend.mapper.abstractions;

public interface ICrudMapper<DTO, Entity> {

    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);
}
