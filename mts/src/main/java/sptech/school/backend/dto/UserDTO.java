package sptech.school.backend.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;
import sptech.school.backend.dto.base.BaseDTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseDTO {

    @NotBlank(message = "valor não pode ser nulo ou vazio")
    private String name;

    private String surname;

    @NotBlank(message = "Esse campo não pode ser nulo")
    @Email(message = "Esse email não é vállido")
    private String email;

    @Pattern(regexp = "(^\\d{8,11}$)",
            message = "Indique um telefone válido")
    private String phone;

    @Pattern(regexp = "^([a-zA-Z0-9@*#]{8,15})$", message = "A senha deve ter entre 8 e 15 caracteres, " +
            "conter pelo menos um caractérer numérico e um especial")
    private String password;
}
