package springboot.mybatis.crud.user.mapper;

import java.util.List;

import springboot.mybatis.crud.user.domain.UserServ;

public interface UserServMapper {

    void deleteByUsername(String username);

    List<UserServ> findByUsername(String username);

    int insert(UserServ userServ);
}
