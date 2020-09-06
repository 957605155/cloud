package com.hp.service.impl;

import com.hp.dao.PaymentDao;
import com.hp.entities.Payment;
import com.hp.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getpaymentbuId(@Param("id") Long id){
        return paymentDao.getpaymentbuId(id);
    }
}
