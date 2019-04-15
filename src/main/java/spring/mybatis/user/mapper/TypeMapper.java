package spring.mybatis.user.mapper;

import java.util.List;

import spring.mybatis.user.domain.Type;

public interface TypeMapper {

    List<Type> findAll();
}
