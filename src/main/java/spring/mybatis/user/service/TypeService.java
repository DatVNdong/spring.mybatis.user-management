package spring.mybatis.user.service;

import java.util.List;

import spring.mybatis.user.domain.Type;

public interface TypeService {

    List<Type> findAll();
}
