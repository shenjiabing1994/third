package cn.edu.oop;

public class TestAll {
	public static void main(String[] args) {
		People p = new Man();
		System.out.println(p.name);
		p.method();
		Man.method();
	}
}

class Man extends People{
	String name = "��";
//	public static void method() {
//		System.out.println("�޸�1");
//	}
}

