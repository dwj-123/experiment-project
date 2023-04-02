package com.example.experimentproject.utils;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AlipayClientUtil {

    @Value("${serverUrl}")
    private  String serverUrl;

    @Value("${appId}")
    private  String appId;

    @Value("${privateKey}")
    private  String privateKey;

    @Value("${alipayPublicKey}")
    private  String alipayPublicKey;
    private AlipayClient alipayClient;

    private AlipayClientUtil(){}
    public  AlipayClient getInstance(){

        if(null == alipayClient){
            alipayClient =  new DefaultAlipayClient(serverUrl,appId,privateKey, AlipayConstants.FORMAT_JSON,AlipayConstants.CHARSET_GBK,alipayPublicKey,AlipayConstants.SIGN_TYPE_RSA2);
        }
        return alipayClient;
    }


}
