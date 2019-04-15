package springboot.mybatis.crud.user.mapper;

import java.util.List;

import springboot.mybatis.crud.user.domain.Type;

public interface TypeMapper {

    List<Type> findAll();
}
