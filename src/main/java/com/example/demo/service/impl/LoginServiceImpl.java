package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.DUser;
import com.example.demo.mapper.DUserMapper;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private DUserMapper dUserMapper;

    @Override
    public DUser login(String username, String password) {
        // 生成条件查询构造器
        QueryWrapper<DUser> wrapper = new QueryWrapper<>();
        // 条件等价于SQL语句"WHERE username = #{username}"
        wrapper.lambda().eq(DUser::getUsername, username);
        // 将查询到的第一条结果返回
        DUser dUser = dUserMapper.selectOne(wrapper);

        if (Objects.equals(dUser.getPassword(), password)) {
            return dUser;
        }
        return null;
    }
}
