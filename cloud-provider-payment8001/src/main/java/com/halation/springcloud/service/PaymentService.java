package com.halation.springcloud.service;


import com.halation.springcloud.entities.Payment;

public interface PaymentService {

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
