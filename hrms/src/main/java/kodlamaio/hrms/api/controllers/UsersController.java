package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/api/users")
public class UsersController {

    private UserService userService;


    public UsersController(UserService userService) {
        this.userService = userService;
    }

    public DataResult<List<User>> getAll(){
        return this.userService.getAll();
    }
}
