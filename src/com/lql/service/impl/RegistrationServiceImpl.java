package com.lql.service.impl;

import com.lql.dao.User;
import com.lql.repo.SalesRepRepository;
import com.lql.service.RegistrationService;

import javax.xml.bind.ValidationException;
import java.util.Arrays;

/**
 * @author liqiuliang
 * @create 2023-09-05 14:05
 */
public class RegistrationServiceImpl implements RegistrationService {

//    private SalesRepRepository salesRepRepo;
//    private UserRepository userRepo;
//
//    public User register(String name, String phone, String address)
//            throws ValidationException {
//        // 校验逻辑
//        if (name == null || name.length() == 0) {
//            throw new ValidationException("name");
//        }
//        if (phone == null || !isValidPhoneNumber(phone)) {
//            throw new ValidationException("phone");
//        }
//        // 此处省略address的校验逻辑
//
//        // 取电话号里的区号，然后通过区号找到区域内的SalesRep
//        String areaCode = null;
//        String[] areas = new String[]{"0571", "021", "010"};
//        for (int i = 0; i < phone.length(); i++) {
//            String prefix = phone.substring(0, i);
//            if (Arrays.asList(areas).contains(prefix)) {
//                areaCode = prefix;
//                break;
//            }
//        }
//        SalesRep rep = salesRepRepo.findRep(areaCode);
//
//        // 最后创建用户，落盘，然后返回
//        User user = new User();
//        user.name = name;
//        user.phone = phone;
//        user.address = address;
//        if (rep != null) {
//            user.repId = rep.repId;
//        }
//
//        return userRepo.save(user);
//    }

    private boolean isValidPhoneNumber(String phone) {
        String pattern = "^0[1-9]{2,3}-?\\d{8}$";
        return phone.matches(pattern);
    }

    @Override
    public User register(String name, String phone, String address) {
        return null;
    }
}

