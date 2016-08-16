package com.cn.hnust.service;

import com.cn.hnust.pojo.Vip;

import java.util.List;

/**
 * Created by liujianmeng on 16/4/9.
 */
public interface IVipService {
    public Vip getVipById(int id);

    public List<Vip> findAllVips();

    public void saveVip(Vip vip);

    public void deleteById(Integer id);
}
