package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.DUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DUserMapper extends BaseMapper<DUser> {
    // 因为使用了MyBatis-Plus的原因我们只需要继承BaseMapper即可
}
