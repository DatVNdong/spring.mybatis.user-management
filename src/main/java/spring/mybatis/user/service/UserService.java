package spring.mybatis.user.service;

import java.util.List;

import spring.mybatis.user.domain.User;

public interface UserService {

    void deleteByUsername(String username);

    List<User> findAll();

    User findOne(int id);

    int insert(User user);

    int update(User user);
}
