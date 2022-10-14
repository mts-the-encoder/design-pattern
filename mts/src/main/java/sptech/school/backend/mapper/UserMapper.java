package sptech.school.backend.mapper;

import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;
import sptech.school.backend.dto.UserDTO;
import sptech.school.backend.entities.UserEntity;
import sptech.school.backend.mapper.abstractions.IOrikaMapper;

@Component
public class UserMapper implements IOrikaMapper {

    @Override
    public void addMapping(MapperFactory mapperFactory) {
        mapperFactory.classMap(UserEntity.class, UserDTO.class)
                .byDefault()
                .register();
    }
}
