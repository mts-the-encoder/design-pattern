package sptech.school.backend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import sptech.school.backend.dto.base.BaseDTO;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseDTO {

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String password;
}
