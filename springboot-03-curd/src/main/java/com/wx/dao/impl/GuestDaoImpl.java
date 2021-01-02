package com.wx.dao.impl;

import com.wx.dao.GuestDao;
import com.wx.entity.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDaoImpl implements GuestDao {

    private static List<Guest> list = new ArrayList<>();

    static {
        list.add(new Guest("王兴","寝室长"));
        list.add(new Guest("张鑫","普通成员"));
        list.add(new Guest("张晓龙","普通成员"));
        list.add(new Guest("张梦宇","普通成员"));
        list.add(new Guest("边全放","普通成员"));
        list.add(new Guest("苗玉浩","普通成员"));
        list.add(new Guest("刘向飞","普通成员"));
    }

    @Override
    public boolean addGuest(Guest guest) {
        return list.add(guest);
    }

    @Override
    public boolean deleteGuest(String name) {
        Guest guest = getGuest(name);
        return list.remove(guest);
    }

    @Override
    public boolean updateGuest(Guest guest) {
        Guest oldGuest = getGuest(guest.getName());
        oldGuest.setRole(guest.getRole());
        return true;
    }

    @Override
    public List<Guest> selectList() {
        return list;
    }

    @Override
    public Guest getGuest(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)){
                return list.get(i);
            }
        }
        return new Guest("","");
    }
}
