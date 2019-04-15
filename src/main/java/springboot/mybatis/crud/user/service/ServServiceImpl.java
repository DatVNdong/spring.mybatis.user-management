package springboot.mybatis.crud.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.mybatis.crud.user.domain.Serv;
import springboot.mybatis.crud.user.mapper.ServiceMapper;

@Service
public class ServServiceImpl implements ServService {

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public List<Serv> findAll() {
        return serviceMapper.findAll();
    }
}
