package com.cn.hnust.dao;

import com.cn.hnust.pojo.Vip;

import java.util.List;

/**
 * Created by liujianmeng on 16/4/9.
 */
public interface IVipDao {
    public Vip getVipById(Integer id);

    public List<Vip> findAllVips();

    public void saveVip(Vip vip);

    public void deleteById(Integer id);
}
