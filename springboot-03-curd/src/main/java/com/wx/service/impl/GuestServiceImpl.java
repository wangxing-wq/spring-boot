package com.wx.service.impl;

import com.wx.dao.GuestDao;
import com.wx.entity.Guest;
import com.wx.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wang xing
 */
@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    GuestDao guestDao;

    @Override
    public boolean add(Guest guest) {
        return guestDao.addGuest(guest);
    }

    @Override
    public boolean delete(String name) {
        return guestDao.deleteGuest(name);
    }

    @Override
    public boolean update(Guest guest) {
        return guestDao.updateGuest(guest);
    }

    @Override
    public List<Guest> list() {
        return guestDao.selectList();
    }

    @Override
    public Guest getGuest(String name) {
        return guestDao.getGuest(name);
    }
}
