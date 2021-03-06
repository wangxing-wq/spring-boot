package com.wx.service;

import com.wx.entity.Guest;

import java.util.List;

/**
 * @author wang xing
 */
public interface GuestService {

    boolean add(Guest guest);

    boolean delete(Integer id);

    boolean update(Guest guest);

    List<Guest> list();

    Guest getGuest(String name);
}
