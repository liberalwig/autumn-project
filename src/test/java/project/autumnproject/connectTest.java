package project.autumnproject;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectTest {

    @Test
    public void test() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver"); // MariaDB

        Connection conn = DriverManager.getConnection("jdbc:mariadb://192.168.0.9:3306/project", "project","password");

        System.out.println(conn);
    }
}
