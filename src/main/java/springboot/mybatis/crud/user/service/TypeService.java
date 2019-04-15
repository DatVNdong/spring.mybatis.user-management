package springboot.mybatis.crud.user.service;

import java.util.List;

import springboot.mybatis.crud.user.domain.Type;

public interface TypeService {

    List<Type> findAll();
}
