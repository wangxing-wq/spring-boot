package com.wx.dao.impl;

import com.wx.dao.GuestDao;
import com.wx.entity.Guest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class GuestDaoImpl implements GuestDao {


    @Override
    public List<Guest> findAll() {
        return null;
    }

    @Override
    public List<Guest> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Guest> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Guest> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Guest guest) {

    }

    @Override
    public void deleteAll(Iterable<? extends Guest> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Guest> S save(S s) {
        return null;
    }

    @Override
    public <S extends Guest> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Guest> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Guest> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Guest> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Guest getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Guest> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Guest> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Guest> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Guest> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Guest> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Guest> boolean exists(Example<S> example) {
        return false;
    }
}
