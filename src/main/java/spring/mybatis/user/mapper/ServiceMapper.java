package spring.mybatis.user.mapper;

import java.util.List;

import spring.mybatis.user.domain.Serv;

public interface ServiceMapper {

    List<Serv> findAll();
}
