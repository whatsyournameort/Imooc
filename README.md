# Imooc
This is a eureka project for test~
先启动server
再启动config
然后是client
最后是other

问题： feign-hystrix 超时配置，根据升级课程步骤配置不起作用
重现：
      启动client：localhost:8081/girl/name/{name}时,设置了2秒等待，正常返回结果
      启动 other：localhost:8082/other/name/{name},OtherController中用fenign，间接调用client接口;
                  并配置了相关超时配置config-repo/other-dev.properties
