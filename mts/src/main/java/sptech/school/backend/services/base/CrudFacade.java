package sptech.school.backend.services.base;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import sptech.school.backend.dto.base.BaseDTO;
import sptech.school.backend.entities.base.BaseEntity;
import sptech.school.backend.mapper.abstractions.ICrudMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
public class CrudFacade<DTO extends BaseDTO, Entity extends BaseEntity> implements ICrudFacade<DTO> {

    protected final JpaRepository<Entity, Long> dao;
    protected final ICrudMapper<DTO, Entity> mapper;

    @Override
    public DTO create(DTO dto) {
        Entity entity = mapper.toEntity(dto);
        dao.save(entity);
        return dto;
    }

    @Override
    public Optional<DTO> findById(Long id) {
        Optional<Entity> entity = dao.findById(id);
        return entity.map(mapper::toDTO);
    }

    @Override
    public List<DTO> findAll() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional
    public DTO update(Long id, DTO dto) {
        dao.deleteById(id);
        Entity entity = mapper.toEntity(dto);
        dao.save(entity);
        return dto;
    }

    @Override
    public boolean getById(Long id) {
        return this.dao.existsById(id);
    }
}
