package Service;

import Vo.UserVo;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

public interface UserService {
    public boolean userLogin(UserVo vo, HttpSession session) throws Exception;

    public void userJoin(UserVo vo) throws Exception;
}
