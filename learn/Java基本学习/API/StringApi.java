package API;

import java.util.ArrayList;
/*
 * 字符出串的内容不可更改，可共享使用，相当于字符串数组，底层数byte[]数组
 * 创建字符串的方法 
 * 1、 public String()
 * 2、 public String(char[ array])
 * 3、 public String(byte[] byte_array)
 * 4、 直接创建，使用双引号，直接写上双引号，直接构造字符串对象
 * 
 * 
 * 字符串直接写上，存在字符串常量池中
 * 对于基本类型 ==代表的是值的比较
 * 对于引用类型==代表地址值得比较
 * 
 */
public class StringApi {
	public void test1() {
		String str1="hello";
		String str2="hello";
		String str4="lipeng";
		String str5="Hello";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str5));
		
		//获取指定元素得位置
		char c=str1.charAt(0);
		System.out.println("获取得字符串得值"+c);
		
		//字符串比较==比较
		char[] char_str3=new char[] {'h','e','l','l','o'};
		String str3=new String(char_str3);
		System.out.println(str1==str2);
        //不同得创建方式，得到得地址不一样
		System.out.println(str2==str3);
		
		//两个字符串进行拼接
		System.out.println("拼接结果"+str1.concat(str4));
		
		//public char[] toCharArray() 当前字符串转换成字符数组
		//public byte[] getByte()   获取当前字符串得底层字节数组
		//public String replice(charsequences)
		char[] chararray=str1.toCharArray();
		//System.out.print("字符数 组转换的结果:%s",chararray);
		 
		//字符串的替换
		String lang1="你大爷的会玩吗 SB";
		String lang2=lang1.replace("大爷", "**");
		System.out.println("替换的结果"+lang2);
		
		//字符串的分割：
		//public String[] split(String regex)按照指定的规则对我们的字符串，返回切割后的数组
		//进行切割
		//split的参数是一个正则表达式
		String str6="my name is lp and i am from china";
		String[] strings=str6.split(" ");
		for (int i = 0; i < str6.length();i++) {
			System.out.println("分割后的结果："+strings[i]);
		}
	    
		
	
		
		
		
		
		
	}
	public static void main(String[] args) {
		StringApi temp=new StringApi();
		temp.test1();
		
	}

}
