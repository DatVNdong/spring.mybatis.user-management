package springboot.mybatis.crud.user.mapper;

import java.util.List;

import springboot.mybatis.crud.user.domain.UserType;

public interface UserTypeMapper {

    void deleteByUsername(String username);

    List<UserType> findByUsername(String username);

    int insert(UserType userType);
}
