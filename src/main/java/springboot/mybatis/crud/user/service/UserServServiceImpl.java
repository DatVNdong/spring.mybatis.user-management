package springboot.mybatis.crud.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.mybatis.crud.user.domain.UserServ;
import springboot.mybatis.crud.user.mapper.UserServMapper;

@Service
public class UserServServiceImpl implements UserServService {

    @Autowired
    private UserServMapper userServMapper;

    @Override
    public void deleteByUsername(String username) {
        userServMapper.deleteByUsername(username);
    }

    @Override
    public List<UserServ> findByUsername(String username) {
        return userServMapper.findByUsername(username);
    }

    @Override
    public int insert(UserServ userServ) {
        return userServMapper.insert(userServ);
    }
}
