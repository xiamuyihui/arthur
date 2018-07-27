package com.tough.service.user;

import com.github.pagehelper.PageInfo;
import com.tough.pojo.User;

import java.util.List;

public interface UserService {

    int insert(User user);

    List<User> selectAll();

    List<User> selectBy(User user);

    User selectById(String id);

    PageInfo<User> selectPage(int pageNum, int pageSize, User user);

    int update(User user);
}
