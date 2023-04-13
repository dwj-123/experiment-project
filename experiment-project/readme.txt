※支付宝电脑网站支付※
第一步：确定自己是企业账号还是个人账号，随后完成注册及实名认证，最后签约成为支付宝商家
第二步：接入准备工作，确定自己的接入方式，商家自研或者服务商代开发。在这一步需要记住三个重要属性
1.生成的应用唯一标识APPID可用于调用开放产品接口
2.应用私钥privateKey，用来给应用消息进行签名
3.支付宝公钥alipayPublicKey，应用收到支付宝同步、异步消息时，使用公钥进行验证签名信息
第三步：准备开发
支付宝电脑网站支付网址
https://open.alipay.com/api/detail?code=I1080300001000041203

※微信电脑网站支付※
第一步：确认支付方式，native支付还是jsAPI支付
第二步：确定接入方式，直连模式或者服务商模式
第三步：获取APPID和mchid商户号并关联，APPID和mchid在调用支付接口时会用到。其他配置API密钥和配置下载商户证书
第四步：准备开发
微信电脑网站支付网址
https://pay.weixin.qq.com/static/applyment_guide/applyment_detail_website.shtml

※银联电脑网站支付※
第一步：入网，选择支付产品后才可以使用银联支付
第二步：申请证书；包含三个证书，签名证书、验签证书、敏感信息加密证书
第三步：下载银联的SDK，开发支付接口

银联电脑网站支付网址
https://merchant.unionpay.com/join/product
https://open.unionpay.com/tjweb/acproduct/list?apiSvcId=448&index=2



