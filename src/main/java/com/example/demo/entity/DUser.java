package com.example.demo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Schema(name = "用户表")
public class DUser implements Serializable {
    private static final long serialVersionUID = 5555491908432000177L;
    private Long id;
    @Schema(description="用户名")
    private String username;
    @Schema(description="密码")
    private String password;
    @Schema(description = "用户昵称")
    private String nickname;
    @Schema(description = "邮箱")
    private String email;
    @Schema(description = "创建时间")
    private Timestamp createTime;
    @Schema(description = "修改时间")
    private Timestamp updateTime;
}
