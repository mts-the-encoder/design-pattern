package sptech.school.backend.services.base;


import org.springframework.data.repository.NoRepositoryBean;
import sptech.school.backend.dto.base.BaseDTO;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface ICrudFacade<DTO extends BaseDTO> {

    Optional<DTO> findById(Long id);

    List<DTO> findAll();

    DTO create(DTO dto);

    void delete(Long id);

    DTO update(Long id, DTO dto);
}
