package springboot.mybatis.crud.user.service;

import java.util.List;

import springboot.mybatis.crud.user.domain.Serv;

public interface ServService {

    List<Serv> findAll();
}
