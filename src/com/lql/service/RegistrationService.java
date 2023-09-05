package com.lql.service;

import com.lql.dao.User;

/**
 * @author liqiuliang
 * @create 2023-09-05 14:04
 */
public interface RegistrationService {
    User register(String name, String phone, String address);
}
