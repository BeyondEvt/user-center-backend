package com.yxb.usercenter.service;
import java.util.Date;

import com.yxb.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 用户服务测试
 *
 * @author yxb
 *
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

//    @Test
//    public void testAddUser(){
//        User user = new User();
//
//        user.setUsername("dogYxb");
//        user.setUserAccount("123");
//        user.setAvatarUrl("https://img-home.csdnimg.cn/images/20201124032511.png");
//        user.setGender(0);
//        user.setUserPassword("xxx");
//        user.setPhone("123");
//        user.setEmail("456");
//
//        boolean result =  userService.save(user);
//        System.out.println(user.getId());
//        Assertions.assertTrue(result);
//    }

    @Test
    void userRegister() {
        String userAccount = "yxb1";
        String userPassword = "";
        String checkPassword = "123456";
        String manageCode = "1";
        long result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        userAccount = "yx";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        userAccount = "yxb1";
        userPassword = "123456";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        userAccount = "yx b1";
        userPassword = "12345678";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        checkPassword = "123456789";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        userAccount = "dogYxb";
        checkPassword = "12345678";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);

        userAccount = "yxb5";
        result = userService.userRegister(userAccount,userPassword,checkPassword,manageCode);
        Assertions.assertEquals(-1,result);


    }
}