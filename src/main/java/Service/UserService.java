package Service;

import Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
}
