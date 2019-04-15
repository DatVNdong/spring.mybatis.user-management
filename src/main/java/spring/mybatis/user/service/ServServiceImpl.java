package spring.mybatis.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mybatis.user.domain.Serv;
import spring.mybatis.user.mapper.ServiceMapper;

@Service
public class ServServiceImpl implements ServService {

    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public List<Serv> findAll() {
        return serviceMapper.findAll();
    }
}
