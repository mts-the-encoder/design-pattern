package sptech.school.backend.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import sptech.school.backend.dto.UserDTO;
import sptech.school.backend.entities.UserEntity;
import sptech.school.backend.mapper.abstractions.ICrudMapper;
import sptech.school.backend.services.abstractions.IUserFacade;
import sptech.school.backend.services.base.CrudFacade;

@Component
public class UserService extends CrudFacade<UserDTO, UserEntity> implements IUserFacade{

    public UserService(JpaRepository<UserEntity, Long> dao, ICrudMapper<UserDTO, UserEntity> mapper) {
        super(dao, mapper);
    }
}
