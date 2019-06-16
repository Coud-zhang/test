package com.zkq;

/**
 * @Author zhangkaiqiang
 * @Date 2019/6/16  9:51
 * @Description
 *
 *考点:
 * 1.类初始化过程
 * 	(1)main方法所在的类会首先进行初始化
 * 	(2)子类进行初始化时，如果父类还没有进行初始化，会先对父类进行初始化
 * 	(3)通过new或者反射去创建对象会引起类的初始化，子类初始化时会引起父类初始化
 * 2.类加载顺序
 * 	（1）先加载静态代码块和静态变量，加载顺序按照在代码中声明的顺序执行，对应编译器自动为类生产的clinit方法，clinit方法只在类加载时执行一次
 * 	 (2)执行非静态代码块和实例变量，加载顺序也是按照在代码中声明的顺序执行，对应编译器自动为类生成的init方法，init每实例化一个对象执行一次
 * 	 (3)执行构造函数
 * 3.方法重写
 * 	(1)final方法 static方法 private方法不能被继承，也就不能被重写(这些方法在类加载的解析阶段就会把符号引用转变为直接引用)
 */
public class Father {

	private int i=test();
	private static int j=method();

	static{
		System.out.println(1);
	}

	Father(){
		System.out.println(2);
	}

	{
		System.out.println(3);
	}

	public int test(){
		System.out.println(4);
		return 1;
	}

	public static int method(){
		System.out.println(5);
		return 1;
	}
}

class Son extends  Father{

	private int i=test();
	private static int j=method();
	static {
		System.out.println(6);
	}

	Son(){
		System.out.println(7);
	}
	{
		System.out.println(8);
	}


	@Override
	public int test(){
		System.out.println(9);
		return 1;
	}

	public static int method(){
		System.out.println(10);
		return 1;
	}

	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println();
		Son s2=new Son();
	}
}
