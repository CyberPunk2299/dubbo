package com.alibaba.dubbo.examples.muqinglin;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("hello")
public interface Hello {
     void sayHello();
}
