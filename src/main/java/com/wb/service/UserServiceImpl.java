package com.wb.service;

import com.wb.entity.User;
import com.wb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public int insertUser(User user) {
        return mapper.insertSelective(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return mapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> getAllUser() {
        return mapper.selectAll();
    }
}
