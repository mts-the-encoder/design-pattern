package sptech.school.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sptech.school.backend.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity extends BaseEntity {

    private String name;

    private String surname;

    private String email;

    @Column(name = "phone", unique = true)
    private String phone;

    private String password;

    public UserEntity(Long id, String name, String surname, String email, String phone, String password) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
