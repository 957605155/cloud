package com.hp.dao;

import com.hp.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getpaymentbuId(@Param("id") Long id);
}
