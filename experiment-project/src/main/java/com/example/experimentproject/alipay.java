package com.example.experimentproject;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;

public class alipay {

    public static void main(String[] args) throws AlipayApiException {

        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", "2018082461122382", "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCuVBRIRrH3lUsLjp93koaH1Ngg1WvGFXFOD8ac0aqQzuBWU+jZViZ0v8DFfBVjW6pJQ/e84i0Lh2JpFuWVLVh9YgjIv0mNQ83iC1n3Ab28gg8p1783/5QSEmNjg6+vCySJAxctqjbE0tqWhsAtM7O+38Oro91B3Gicn3GzFJQ9VydrwMda+hd5U5FYP2sNSf6cNHS6A5PasKhMaQOCGiQhW40kD7u5TklyzAiXT7t18aq8J6VlGlPe31tX8iFLiSCV87v7COH7krXHKhpNoM/SWf8Z+rlbUe2pbkuX38JsPt3l80fooTf7sYhj0I4LnjIg/Aoh8QE1sMuASSbGCS+VAgMBAAECggEABQDiyCRHTVzal41TZGIvPEzOmzqk6j2JT/1B7RRTee6GH9QutbY0SluKk+B42K4z2AB8Zs5zDoanO27tzfdMN+UNbX2YBdbxXNCIl39US8nL156anWfXfyFJ+vw3maWPOeN90dC127ZVkcZyU5nNSegwPIfqfM5vrjchU0t+6be/gZAyIocA6PaRxPWSf567ANs7jguedeMPdVVdvee6rY1ROhKwdyLP2kls4pKzXv3FSQcbs/alyfqhZWvcWdNebjvFTJszsipjPFGOnIQmxzxOZbPEF++nyiM2OeOoO36bDVBFsXtfttm8qsxs+tWQwGRsJEW0h2a3qBMI4+hpYQKBgQDh0YbN76tcW255XMiGsHIazfct4Ji6JYCkqBPTiVa9NingCL+aCC/4sqKoKN8FNlvWaTR4YmpT4tAYpeyW40vcLqYZT+0gbucWkbBTWB0o2qmkEeIczr4IZON0QW1rV9clpXWpl4HR1qxvFq3zxXDRcnAUqSK9o8ajUlwbJoH1bQKBgQDFoMy6lGPnFLYKTPDF/JdLbqqkuAy87BmlrkqylrVw0MquJHFm/UujNmSOS+2FbmI17wAkSl0Dku9c0bKNTtPBquqeq5Wol/SEB4C6Sr5oCaRtz92Sp48rYuRYEoy6AI6Rv0osKg2t+UVnE42bDiq2SwkYoG5Xj9b1lFBD+bhRyQKBgDZZNEWKIkb3Jm6FGyn3e27iFVRwUrGyZvS6ExN9YWfmikuGL38F623CqI0qUQqzG4VOCrfSj96inwzfmkJycAaNH6LF7r84kduHstVMRrBXeC6psy7VvzzL80Y+nPQRzxEbcmcftLnpHdUas0ERSubN0RXX4ymbKiqSnuJV8T89AoGAP0x8pnom8XnJwMzaBaAc2XVNxMqKkexRXqbPmBn7bXICqPpVNDaHBnTCim05W5Z6cGnnsrf6yM1ES4eC2A3ad1qGIWI14jUhhTRd/8025V3JQ77jajiu+6eGGct/NYg+IeKSIEkr7oA7wYMaxQIpng+0jyW7keIpaKkjeFJAvjkCgYBnu5KAZWBHuv/nr+P43zFTYylMZhoKN3IqT4PO5f06xiWxTX3zn9k5Fg/M7WdzgHak7H/MgSoQoftVfFgD5YWklUNh4AXjprdf4oSMIzM88QHTFplHh2hFLnplJrP6qGCsW2MUWQR0CF/uNdOaDp/AYOUCAqnI/WWzd3ceFxj0FQ==", "json", "GBK", "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlpmpIhPr7pqm+v9wHQTd3xD7Wo1Ko7VTkMBgkw/V9jKd8h9vpUSKnx8la4SlJBY2Rcn72YXwMB3fjvh9MhrxY0yGsGJzwcpFjYa9z/ivwxke8uuyT9jVtDGWIMeVPPChaRF5pEyb6kJ6jDsdrp34GnNYthrblWqUKuw7QvRfvpARwl/Gp3pczwcPRWnkHrcnoZzU6YndLSVAqT+gmFia0DJ2H4S27r8igegbfbOpTJc+n+YuN734LLvcaoKINR9CbRPSkF5JOMmuwWThBdKBU5VwT/mrLwbIxdZkLcZ/w/17NZMHy963efhwIqTOEAup6WTD27sJi+MLjIkD9B4/6QIDAQAB", "RSA2");
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
//异步接收地址，仅支持http/https，公网可访问
        request.setNotifyUrl("");
//同步跳转地址，仅支持http/https
        request.setReturnUrl("");
//必传参数
        JSONObject bizContent = new JSONObject();
//商户订单号，商家自定义，保持唯一性
        bizContent.put("out_trade_no", "20210817010101004");
//支付金额，最小值0.01元
        bizContent.put("total_amount", 0.01);
//订单标题，不可使用特殊符号
        bizContent.put("subject", "测试商品");
//电脑网站支付场景固定传值FAST_INSTANT_TRADE_PAY
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");

//可选参数
        //bizContent.put("time_expire", "2022-08-01 22:00:00");

//// 商品明细信息，按需传入
//JSONArray goodsDetail = new JSONArray();
//JSONObject goods1 = new JSONObject();
//goods1.put("goods_id", "goodsNo1");
//goods1.put("goods_name", "子商品1");
//goods1.put("quantity", 1);
//goods1.put("price", 0.01);
//goodsDetail.add(goods1);
//bizContent.put("goods_detail", goodsDetail);

//// 扩展信息，按需传入
//JSONObject extendParams = new JSONObject();
//extendParams.put("sys_service_provider_id", "2088511833207846");
//bizContent.put("extend_params", extendParams);

        request.setBizContent(bizContent.toString());
        AlipayTradePagePayResponse response = alipayClient.pageExecute(request);
        if (response.isSuccess()) {
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }


    }
}
