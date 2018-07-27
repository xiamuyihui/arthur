package com.tough.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tough.dao.UserMapper;
import com.tough.pojo.User;
import com.tough.pojo.UserExample;
import com.tough.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> selectAll() {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> selectBy(User user) {
        UserExample example = new UserExample();
        return userMapper.selectByExample(example);
    }

    @Override
    public User selectById(String id) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(id);
        return userMapper.selectByExample(example).get(0);
    }

    @Override
    public PageInfo<User> selectPage(int pageNum, int pageSize,User user) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample example = new UserExample();
        //example.createCriteria().
        List<User> userlist = userMapper.selectByExample(example);
        PageInfo result = new PageInfo(userlist);
        return result;
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
