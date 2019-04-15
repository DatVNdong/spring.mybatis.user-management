package springboot.mybatis.crud.user.service;

import java.util.List;

import springboot.mybatis.crud.user.domain.UserServ;

public interface UserServService {

    void deleteByUsername(String username);

    List<UserServ> findByUsername(String username);

    int insert(UserServ userServ);
}
