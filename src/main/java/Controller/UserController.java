package Controller;

import Service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

     final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


}
