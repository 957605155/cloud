package com.hp.controller;

import com.hp.entities.CommonResult;
import com.hp.entities.Payment;
import com.hp.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result>0){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(200,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getpaymentbuId(id);
        if(payment!=null){
            return new CommonResult(200,"查询数据成功",payment);
        }else{
            return new CommonResult(200,"没有对应记录id="+id,null);
        }
    }
}
