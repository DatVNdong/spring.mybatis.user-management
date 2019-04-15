package spring.mybatis.user.mapper;

import java.util.List;

import spring.mybatis.user.domain.UserServ;

public interface UserServMapper {

    void deleteByUsername(String username);

    List<UserServ> findByUsername(String username);

    int insert(UserServ userServ);
}
