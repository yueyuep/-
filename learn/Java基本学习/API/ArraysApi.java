package API;

import java.util.Arrays;

public class ArraysApi {
	/*
	 java.util包中，提供了许多与数组相关的静态方法
	 1、public Static String toString()将数组转换成字符粗模式
	 2、如果是数值，sort默认按照升序从小到大进行排序
	 3、如果是字符串，sort默认按照字母升序进行排序
	 4、如果是自定义的类型，那么这个自定义的类需要comparable或者comparable接口
	 的支持。*/
	  public static void main(String[] args) {
		int[] temp={1,3,2};
		String[] strings= {"aaa","ccc","bbb"};
		System.out.println("字符串转换成数组的格式"+Arrays.toString(temp));
		Arrays.sort(temp);
		Arrays.sort(strings);
		System.out.println("排序后的结果"+Arrays.toString(temp));
		System.out.println("字符串排序后的结果"+Arrays.toString(strings));
	}

}
