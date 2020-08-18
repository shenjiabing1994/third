package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 注解描述的类是springboot项目启动运行的入口
 * 我们可以通过此类启动springboot项目
 *思考:springboot工程在启动时会做些什么?
 *	1)通过线程调用相关API从指定路径查找相关的配置文件.class文件
 *	2)调用IO对象从磁盘中读取文件(将文件内容读到内存-cpu只能从内存读取数据)
 *	3)检测类是否有特定的注解描述(@Controller...)
 *	4)Spring框架基于工厂对象(BeanFactory)为指定class创建其实例对象
 *		并基于配置描述对这些对象进行初始化操作
 *	5)讲对象存储到Spring框架管理的池中(Bean池-其底层设计是一个map)
 *
 */
@SpringBootApplication
public class CgbSboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(CgbSboot01Application.class, args);
    }

}
