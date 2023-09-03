package com.yxb.usercenter.service;

import com.yxb.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yxb.usercenter.model.domain.request.UserUpdatePasswordRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yxb
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-08-23 22:24:47
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param manageCode 用户编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String manageCode);

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 用户请求
     * @return 用户信息（脱敏）
     */
    User userLogin(String  userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param orginUser
     * @return
     */
    User getSafetyUser(User orginUser);

    /**
     * 用户注销
     * 
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 修改密码
     *
     * @param updatePasswordRequest
     * @param request
     */
    boolean updateUserPassword(UserUpdatePasswordRequest updatePasswordRequest, HttpServletRequest request);

    /**
     * 上传用户头像
     * @param file
     * @param request
     * @return
     */
    boolean uploadFileAvatar(MultipartFile file, HttpServletRequest request);
}
