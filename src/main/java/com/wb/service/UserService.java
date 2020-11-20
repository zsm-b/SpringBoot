package com.wb.service;

import com.wb.entity.User;

import java.util.List;

public interface UserService {
    //增加
    public int insertUser(User user);
    //删除
    public int  deleteUser(Integer id);
    //修改
    public int updateUser(User user);
    //查询
    public List getAllUser();

}
