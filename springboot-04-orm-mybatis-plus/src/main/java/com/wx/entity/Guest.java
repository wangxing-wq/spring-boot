package com.wx.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wang xing
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {

    private Integer id;
    private String name;
    private String role;

}
