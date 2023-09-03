package com.yxb.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author yxb
 */
@Data
public class UserDeleteRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;


}