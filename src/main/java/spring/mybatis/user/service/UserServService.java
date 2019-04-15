package spring.mybatis.user.service;

import java.util.List;

import spring.mybatis.user.domain.UserServ;

public interface UserServService {

    void deleteByUsername(String username);

    List<UserServ> findByUsername(String username);

    int insert(UserServ userServ);
}
