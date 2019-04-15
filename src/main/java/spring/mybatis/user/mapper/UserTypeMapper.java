package spring.mybatis.user.mapper;

import java.util.List;

import spring.mybatis.user.domain.UserType;

public interface UserTypeMapper {

    void deleteByUsername(String username);

    List<UserType> findByUsername(String username);

    int insert(UserType userType);
}
