package 继承;

public class Succeed {
	/*
	 面向对象的三大特征，封装性、继承、多态，继承是多态的前提
	 没有继承，就没有多态。
	 继承：师傅传授武功来划分的，师傅有多少武功，徒弟就有多少武功
	 
	 
	 继承主要解决的是共性抽取的问题
	 
	 *
	 *
	 1、子类可以拥有父类的内容
	 2、子类可以有自己的内容
	 3、继承关系中，子类就是父类，子类可以当成父类
	 4、子类知道父类的内容，但是父类不知道子类的内容。
	 4、 重写(override)，在继承关系当中，方法的名称一样，参数列表也一样。方法的覆盖
	 5、重载(overload),方法的名称一样，参数列表不一样
	 6、方法的覆盖重写的特点，创建的是子类方法，优先用子类方法
	 */
	
	
	
	
	/*
	 子类和父类成员变量访问的问题，如果成员变量同名，则创建子类对象时，访问有两种
	 方式：1、直接通过子类对象访问成员变量
	 	等号左边是谁，优先使用谁，没有向上找。
	 	
	 	 2、间接通过成员方法访问成员变量
	 	 使用本类中变量访问方法，该方法在哪定义的，就优先用哪，没有就向上找*/
	
	
	/*
	 局部变量、父类变量，子类变量的重名问题(this关键字使用)
	 局部变量：直接使用
	 本类的变量：this.
	 父类的变量： super.*/
	
	
	/**/
	public static void main(String[] args) {
		//teache继承Employee类
		Teache teache=new Teache();
		System.out.println("=================");
		System.out.println(teache.number);
		System.out.println("=================");
		System.out.println("this关键字的使用后"+teache.get());
		System.out.println("super关键字的使用后"+teache.get());
		
		
	}
 
}
