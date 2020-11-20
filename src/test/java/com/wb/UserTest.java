package com.wb;

import com.wb.entity.User;
import com.wb.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void insertUserTest(){
        User user=new User("lixiaoxing","265");
        int n=userService.insertUser(user);
        System.out.print(n);
    }

    @Test
    public void deleteUserTest(){
        System.out.print(userService.deleteUser(24));
    }

    @Test
    public void updateUserTest(){
        User user=new User(23,"lizixi","456465");
        int n=userService.updateUser(user);
        System.out.print(n);
    }

    @Test
    public void selectUserTest(){
        List<User> list=userService.getAllUser();
        for (User user : list) {
            System.out.printf(user.toString());
        }
    }

}
