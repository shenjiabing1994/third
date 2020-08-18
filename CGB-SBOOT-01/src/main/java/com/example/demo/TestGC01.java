package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClassA{
	//对象在被回收前会执行此方法
	@Override
	protected void finalize() {
		System.out.println("==finalize()==");
	}
}
public class TestGC01 {
	//假设为Spring中的bean池
	static Map<String, Object> beanPool = new HashMap<>();
	public static void main(String[] args) {
		ClassA c1=new ClassA();//假设这个对象是spring创建的
		beanPool.put("classA", c1);//假设这个是Spring中作用为singletond的对象,对象还会存储到池
		//问题:对于c1指向的对象何时会被JVM认为是垃圾(此对象不可达,即没有任何引用指向此对象)
		//当c1指向的对象也没有其他引用指向它
		//此对象就为一个不可达对象,也就会被认为是一个垃圾对象了
		c1=null;
		//beanPool.clear();
		//beanPool.remove("classA");
		/*
		 * 在JVM内存中对象的回收,需要通过GC系统去实现,GC系统的启动会分2中方式
		 *1)手动启动GC(一般不需要)
		 *  System.gc();
		 *2)自动启动GC(系统底层会这创建对象的增加没 然后基于内存情况,启动GC)
		 */
		List<byte[]> list = new ArrayList<>();
		for(int i = 0;i<1000000;i++) {
			list.add(new byte[1024*1024]);
		}
		//1.如何判断GC系统执行了(通过配置JVM参数:-XX:+printGC)
		//2.如何判断对象呗GC了(通过重写Object类中的finalize方法)
		
		
		
		
		
		
	}
}
