package springboot.mybatis.crud.user.mapper;

import java.util.List;

import springboot.mybatis.crud.user.domain.Serv;

public interface ServiceMapper {

    List<Serv> findAll();
}
