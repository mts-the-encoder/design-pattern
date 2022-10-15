package sptech.school.backend.services;

import lombok.experimental.SuperBuilder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import sptech.school.backend.dto.UserDTO;
import sptech.school.backend.entities.UserEntity;
import sptech.school.backend.mapper.abstractions.ICrudMapper;
import sptech.school.backend.services.abstractions.IUserFacade;
import sptech.school.backend.services.base.CrudFacade;

@Component
public class UserService extends CrudFacade<UserDTO, UserEntity> implements IUserFacade{

    public UserService(CrudRepository<UserEntity, Long> dao, ICrudMapper<UserDTO, UserEntity> mapper) {
        super(dao, mapper);
    }
}
