package com.wx.dao;

import com.wx.entity.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wang xing
 */
@Repository
public interface GuestDao {

    /**
     * 添加Guest的方法
     * @param guest 添加Guest的msg
     * @return 返回 boolean 判断是否成功
     */
    boolean addGuest(Guest guest);

    /**
     * 删除Guest的方法
     * @param name 参数位Guest 的name
     * @return 返回值位布尔,判断是否成功
     */
    boolean deleteGuest(String name);

    /**
     * 修改Guest,参数位修改Guest的Guest
     * @param guest 参数Guest提供修改信息
     * @return 返回是否修改成功
     */
    boolean updateGuest(Guest guest);

    /**
     * 查询Guest集合
     * @return 返回查询Guest集合
     */
    List<Guest> selectList();

    Guest getGuest(String name);
}
