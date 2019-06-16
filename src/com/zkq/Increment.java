package com.zkq;

/**
 * @Author zhangkaiqiang
 * @Date 2019/6/16  9:44
 * @Description
 *
 * 自增运算在JVM层面分析
 *
 * 自增 自减操作都是直接修改变量的值，不需要经过操作数栈，操作数栈中仅仅保存临时结果
 */
public class Increment {
	public static void main(String[] args) {
		int i=1;
		i=i++;
		int j=i++;
		int k=i+ ++i *i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
