package com.wx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author wang xing
 */
@Data
@AllArgsConstructor
public class Person {

    @NotBlank(message = "名字不能为空")
    private String name;
    @NotBlank(message = "角色不能为空")
    private String role;

}
