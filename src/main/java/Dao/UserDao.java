package Dao;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    // 필드
    private MariaDbDataSource mariaDbDataSource;

    public UserDao(MariaDbDataSource mariaDbDataSource) {
        this.mariaDbDataSource = mariaDbDataSource;
    }
}
