package com.tough.controller;

import com.tough.pojo.Result;
import com.tough.pojo.User;
import com.tough.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public Result insert(@RequestBody User user) {
        int r = userService.insert(user);
        Result result = new Result();
        result.setSuccess(Result.SUCCESS_CODE);
        result.setMsg("操作成功");
        return result;
    }

    /*@PostMapping("")
    public Result selectPage(@RequestBody User user, @RequestParam(name = "pageNum", required = false, defaultValue = "1")
            int pageNum, @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageInfo<User> page = userService.selectPage(pageNum, pageSize, user);
        Result result = new Result();
        result.setSuccess(Result.SUCCESS_CODE);
        result.setMsg("操作成功");
        result.setData(page);
        return result;
    }*/

    @PostMapping("/login")
    @ResponseBody
    public User login(@ModelAttribute User user
    ) {
        //User user = new User();
        //resp.setHeader("Access-Control-Allow-Origin", "*");
        user.setLoginName(user.getUserName());
        user.setPassword(user.getPassword());
        Result result = new Result();
        result.setSuccess(Result.SUCCESS_CODE);
        result.setMsg("操作成功");
        try {
            user = userService.selectBy(user).get(0);
            result.setObj(user);
        } catch (Exception e) {
            result.setSuccess(Result.ERROR_CODE);
            result.setMsg("登录失败检，请查用户名密码");
        }
        return user;
    }

    @GetMapping("")
    public Result selectAll() {
        List<User> userList = userService.selectAll();
        Result result = new Result();
        result.setSuccess(Result.SUCCESS_CODE);
        result.setData(userList);
        result.setMsg("操作成功");
        return result;
    }


    @PutMapping("")
    public Result update(@RequestBody User user) {
        int r = userService.update(user);
        Result result = new Result();
        result.setSuccess(Result.SUCCESS_CODE);
        result.setMsg("操作成功");
        return result;
    }

}
