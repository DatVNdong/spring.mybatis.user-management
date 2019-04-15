package springboot.mybatis.crud.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.mybatis.crud.user.domain.UserType;
import springboot.mybatis.crud.user.mapper.UserTypeMapper;

@Service
public class UserTypeServiceImpl implements UserTypeService {

    @Autowired
    private UserTypeMapper userTypeMapper;

    @Override
    public void deleteByUsername(String username) {
        userTypeMapper.deleteByUsername(username);
    }

    @Override
    public List<UserType> findByUsername(String username) {
        return userTypeMapper.findByUsername(username);
    }

    @Override
    public int insert(UserType userType) {
        return userTypeMapper.insert(userType);
    }
}
