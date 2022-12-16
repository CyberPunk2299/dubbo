package com.alibaba.dubbo.examples.muqinglin;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.remoting.Transporter;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import org.junit.jupiter.api.Test;

/**
 * @description: 测试1
 * @author: rd_qinglin_mu
 * @create: 2022-12-06 19:03
 **/
public class MuQinglinTest {

    @Test
    public void testProtocol() throws Exception {
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        LoadBalance  loadBalance  = ExtensionLoader.getExtensionLoader(LoadBalance.class).getAdaptiveExtension();
        Transporter   ransporter   = ExtensionLoader.getExtensionLoader(Transporter.class).getAdaptiveExtension();
    }
    @Test
    public void testHello() throws Exception {
        ExtensionLoader<Hello> extensionLoader =
                ExtensionLoader.getExtensionLoader(Hello.class);
        Hello hello = extensionLoader.getExtension("hello");
        hello.sayHello();
    }

}
