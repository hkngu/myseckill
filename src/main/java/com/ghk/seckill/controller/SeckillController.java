//package com.ghk.seckill.controller;
//
//import com.ghk.seckill.domian.Customer;
//import com.ghk.seckill.domian.OrderInfo;
//import com.ghk.seckill.domian.SeckillOrder;
//import com.ghk.seckill.result.CodeMsg;
//import com.ghk.seckill.service.GoodsService;
//import com.ghk.seckill.vo.GoodsVo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//@RequestMapping("/seckill")
//public class SeckillController {
//
//    @Autowired
//    OrderService orderService;
//
//    @Autowired
//    GoodsService goodsService;
//
//    @Autowired
//    SeckillService seckillService;
//
//    @RequestMapping("/do_seckill")
//    public String seckill(Model model, Customer customer, @RequestParam String goodsId){
//        //验证登录
//        if (customer == null)
//            return "login";
//        //验证库存
//        GoodsVo goods = goodsService.getGoodsVoById(goodsId);
//        Integer seckillStock = goods.getSeckillStock();
//        if (seckillStock < 1){
//            model.addAttribute("errMsg", CodeMsg.STOCK_ERR.getMsg());
//            return "seckill_fail";
//        }
//        //判断是否秒杀到
//        SeckillOrder seckillOrder = orderService.getSeckillOrder(customer.getCustomerId(),goodsId);
//        if (seckillOrder == null){
//            model.addAttribute("errMsg",CodeMsg.BIND_EXCEPTION.getMsg());
//            return "seckill_fail";
//        }
//        //秒杀成功
//        OrderInfo  orderInfo = seckillService.seckill(customer,goods);
//        return null;
//    }
//}
