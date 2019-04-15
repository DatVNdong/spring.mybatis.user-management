package spring.mybatis.user.service;

import java.util.List;

import spring.mybatis.user.domain.UserType;

public interface UserTypeService {

    void deleteByUsername(String username);

    List<UserType> findByUsername(String username);

    int insert(UserType userType);
}
