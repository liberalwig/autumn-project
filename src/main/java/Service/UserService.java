package Service;

import Dao.UserDao;
import Vo.UserVo;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public interface UserService {
    public boolean userLogin(UserVo vo, HttpSession session) throws Exception;
}
