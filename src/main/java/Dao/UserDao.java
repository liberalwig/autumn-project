package Dao;

import Vo.UserVo;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    // 필드
    private MariaDbDataSource mariaDbDataSource;

        public UserDao(MariaDbDataSource mariaDbDataSource) {

            this.mariaDbDataSource = mariaDbDataSource;
        }

        // 메소드 일반
        // 유저1_회원가입 폼: 없음

        // 유저2_회원 가입
        public int insertUser(UserVo userVo) {
            System.out.println("UserDao > insertUser()");

            int count = mariaDbDataSource.("user.insertUser", userVo);
            System.out.println(count + " 명의 회원이 추가되었습니다.");

            return count;
        }


        // 유저3_아이디 중복 체크
        public UserVo getId(UserVo userVo) {
            System.out.println("UserDao > getId()");

            return mariaDbDataSource.selectOne("user.getId", userVo);
        }

        // 유저4_로그인 폼: 없음


        // 유저5_로그인: 성공/실패
        public UserVo getUser(UserVo userVo){
            System.out.println("UserDao > getUser()");

            return mariaDbDataSource.selectOne("user.getUser", userVo);
        }


        // 유저6_로그아웃
}
