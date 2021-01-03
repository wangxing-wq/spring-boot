package com.wx.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wx.entity.Guest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wang xing
 */
@Mapper
public interface GuestDao extends BaseMapper<Guest> {

}
