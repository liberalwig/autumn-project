package Controller;

import Vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

     final UserService userService;
     final UsrService usrService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

        public ModelAndView userLogin(@ModelAttribute UserVo vo, HttpSession session) throws Exception {
            boolean result = service.userLogin
        }

}
