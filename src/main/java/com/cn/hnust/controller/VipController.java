package com.cn.hnust.controller;

import com.cn.hnust.pojo.Vip;
import com.cn.hnust.service.IVipService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liujianmeng on 16/4/9.
 */
@Controller
@RequestMapping("/vips")
public class VipController {

    @Resource
    private IVipService vipService;

    @RequestMapping("/getById")
    public String toIndex(HttpServletRequest request, Model model) {
        int vipId = Integer.parseInt(request.getParameter("id"));
        Vip vip = this.vipService.getVipById(vipId);
        if (vip != null) System.out.println("%%%%%%%" + vip.getName());
        model.addAttribute("vip", vip.getName());
        return "vipManager";
    }

    @RequestMapping("/findAll")
    public
    @ResponseBody
    Map<String, Object> findAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Vip> vipList = this.vipService.findAllVips();
        if (vipList.size() != 0) System.out.println("%%%%%%%" + vipList.size());
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("成功!");
        map.put("vipList", vipList);
        return map;
    }


    @RequestMapping("/findAllTest")
    public String findAllTest(HttpServletRequest request, Model model) {
        return "vipManager";
    }

    @RequestMapping("/mapTest")
    public String mapTest(HttpServletRequest request, Model model) {
        return "mapTest";
    }


    @RequestMapping(value = "getVip")
    public
    @ResponseBody
    Map<String, Object> getById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        int id = Integer.valueOf(request.getParameter("id"));
        Vip vip = vipService.getVipById(id);
        System.out.println("成功");
        map.put("msg", vip.getName());
        return map;
    }


    @RequestMapping(value = "deleteVip")
    public
    @ResponseBody
    Map<String, Object> deleteVipById(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        int vipId = Integer.valueOf(request.getParameter("vipId"));
        System.out.println("开始删除...");
        vipService.deleteById(vipId);
        System.out.println("删除成功!");
        map.put("msg", "success");
        return map;
    }


}
