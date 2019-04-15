package springboot.mybatis.crud.user.service;

import java.util.List;

import springboot.mybatis.crud.user.domain.UserType;

public interface UserTypeService {

    void deleteByUsername(String username);

    List<UserType> findByUsername(String username);

    int insert(UserType userType);
}
