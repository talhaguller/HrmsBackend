package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserAddService;
import kodlamaio.hrms.core.entities.UserAdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/userAdds")
public class UserAddsController {

    private UserAddService userAddService;

    @Autowired
    public UserAddsController(UserAddService userAddService) {
        this.userAddService = userAddService;
    }

    public ResponseEntity<?> add(@RequestBody UserAdd userAdd){
        return ResponseEntity.ok(this.userAddService.add(userAdd));
    }
}
