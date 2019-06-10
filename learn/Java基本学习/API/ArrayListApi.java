package API;
import java.util.ArrayList;
/*泛型可以理解为类型的形式化参数，这个可与我们定义方法中传入变量的形式参数进行类比，要求我们传入
具体类型的形式参数。泛型只能是引用类型，不能是基本类型
ArrayList 打印出的值是内容，并不是地址值
jdk 1.7以后后面的尖括号可以不用写。


 */
//list.add() 添加数据，可以不接受返回值
//list.remove() 删除元素
//list.size() 返回集合元素的个数
//list .get(index) 根据索引获取特定的值，返回被删除的值
// 如果使用arraylist来存储基本类型，必须使用基本的类型的包装类。


//基本类型-包装类
/*
 基本类型	包装类 (引用类型)
 byte	Byte
 short	Short
 int	Intager
 long	Long 
 flot	Float
 double Double
 char	Character
 boolean	Boolean
 从JDK1.5+开始，支持自动装箱，自动拆箱
 装箱：基本类型自动变成引用类型
 拆箱：包装类型自动变成基本类型

 */
import java.util.List;
import java.util.Random;
public class ArrayListApi {
	public void test1() {
		/*ArrayList实现了List的接口，所以可以这样定义*/
		 //ArrayList<int []> arrayList=new ArrayList<int []>();
		 List<int []> arrayList=new ArrayList<int []>();
	     int [] tmp=new int[] {1,2,3,4,5,6};
		  arrayList.add(tmp);//默认是插入成功
		  System.out.println(arrayList.get(0));
		  for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j < arrayList.get(i).length; j++) {
				System.out.println(arrayList.get(i)[j]);
			}
		}
		
	}
	public void test2() {
		//随机生成6个33以内的随机数，并存储起来
	  Random random=new Random();
	  ArrayList<Integer> list=new ArrayList<>();
	  for (int i = 0; i < 6; i++) {
		  int tmp =(random.nextInt())%33;
		  list.add(tmp);
	}
	  for (int i = 0; i < list.size(); i++) {
		System.err.println("第"+i+"个数据"+list.get(i));
	}
		
	}
	public static void main(String[] args) {
	     ArrayListApi temp=new ArrayListApi();
	     //temp.test1();
	     temp.test2();
		
	}

	
 
}
