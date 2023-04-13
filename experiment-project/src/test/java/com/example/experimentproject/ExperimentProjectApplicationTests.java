package com.example.experimentproject;

import com.alipay.api.AlipayApiException;
import com.example.experimentproject.service.impl.AlipayServiceImpl;
import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ExperimentProjectApplication.class)
class ExperimentProjectApplicationTests {

    @Resource
    AlipayServiceImpl alipayService;

    /**
     * 统一收单下单并支付页面接口
     *
     */
    @Test
    void contextLoads() throws AlipayApiException {

        String msg = alipayService.AlipayTradePagePay(110L, "0.01");
        System.out.println(msg);
    }







}
