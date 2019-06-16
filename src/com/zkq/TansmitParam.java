package com.zkq;

import java.util.Arrays;

/**
 * @Author zhangkaiqiang
 * @Date 2019/6/16  14:28
 * @Description
 *
 * Java中参数传递机制:Java中基本数据类型在方法间传递的是值的拷贝，引用类型变量在方法间传递的是引用变量的值的拷贝(即内存中地址值的拷贝)
 * String类型以及包装类型具有不可变性:即发生字符串的拼接以及数字的加减是会在堆中产生一个新的对象，然后执行这个新的对象
 */
public class TansmitParam {
	public static void main(String[] args) {
		int i=1;
		String str="hello";
		Integer num=200;
		int [] arr={1,2,3,4,5};
		MyData my=new MyData();

		change(i,str,num,arr,my);

		System.out.println(i);
		System.out.println(str);
		System.out.println(num);
		System.out.println(Arrays.toString(arr));
		System.out.println(my.a);
	}

	public static void change(int j,String s,Integer n,int [] array,MyData m){
		j++;
		s+="world";
		n++;
		array[0]++;
		m.a++;

	}
}

class MyData{
	int a=10;
}
