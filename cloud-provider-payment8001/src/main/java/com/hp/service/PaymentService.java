package com.hp.service;

import com.hp.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getpaymentbuId(@Param("id") Long id);
}
