package com.example.demo.mapper;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {

    User selectUserbyId(Integer id);

    //添加用户
    void addUser(User user);

    //删除用户
    void delUser(Integer id);

    //查询用户
    User findUserbyId(Integer id);

    User findUserbyUsername(String username);

    //修改用户
    void saveUser(User user);
}
