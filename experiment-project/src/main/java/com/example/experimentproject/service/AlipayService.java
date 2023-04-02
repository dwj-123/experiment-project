package com.example.experimentproject.service;

import com.alipay.api.AlipayApiException;

public interface AlipayService {

    /**
     * 下单支付接口
     * @param ProductId 商品id
     * @param TotalAmount 商品金额
     */
   String AlipayTradePagePay(Long ProductId,String TotalAmount) throws AlipayApiException;
}
