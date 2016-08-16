package com.cn.hnust.service.impl;

import com.cn.hnust.dao.IVipDao;
import com.cn.hnust.pojo.Vip;
import com.cn.hnust.service.IVipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liujianmeng on 16/4/9.
 */
@Service("vipService")
public class VipServiceImpl implements IVipService {
    public IVipDao getVipDao() {
        return vipDao;
    }

    public void setVipDao(IVipDao vipDao) {
        this.vipDao = vipDao;
    }

    @Resource
    private IVipDao vipDao;

    public Vip getVipById(int id) {
        System.out.println(id);
        return vipDao.getVipById(id);
    }

    public List<Vip> findAllVips() {
        return vipDao.findAllVips();
    }

    public void saveVip(Vip vip) {
        vipDao.saveVip(vip);
    }

    public void deleteById(Integer id) {
        vipDao.deleteById(id);
    }
}
