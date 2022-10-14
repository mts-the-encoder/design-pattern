package sptech.school.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.backend.controllers.base.BaseController;
import sptech.school.backend.dto.UserDTO;
import sptech.school.backend.services.base.ICrudFacade;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController<UserDTO> {

    @Autowired
    public UserController(ICrudFacade<UserDTO> facade) {
        super(facade);
    }
}
