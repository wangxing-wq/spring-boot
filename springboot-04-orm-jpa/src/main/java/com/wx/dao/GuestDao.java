package com.wx.dao;

import com.wx.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wang xing
 */
@Repository
public interface GuestDao extends JpaRepository<Guest,Integer> {


}
