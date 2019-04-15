package spring.mybatis.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mybatis.user.domain.Type;
import spring.mybatis.user.mapper.TypeMapper;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> findAll() {
        return typeMapper.findAll();
    }
}
