package com.yxb.usercenter.contant;

/**
 * 用户常量
 *
 * @author yxb
 */
public interface UserConstant {


    /**
     * 用户登录态键（key）
     */
    String USER_LOGIN_STATE = "userLoginState";

    // --------权限--------
    /**
     * 默认权限
     */

    int DEFAULT_ROLE = 0;
    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;

    /**
     * ban-封号
     */
    int USER_BAN = 2;

    /**
     * 盐值,将密码进行混淆
     */
    String SALT = "yxb";

}
