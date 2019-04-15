package springboot.mybatis.crud.user.mapper;

import java.util.List;

import springboot.mybatis.crud.user.domain.User;

public interface UserMapper {

    void deleteByUsername(String username);

    List<User> findAll();

    User findOne(int id);

    int insert(User user);

    int update(User user);
}
