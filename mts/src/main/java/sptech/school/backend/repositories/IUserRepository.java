package sptech.school.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.school.backend.entities.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
