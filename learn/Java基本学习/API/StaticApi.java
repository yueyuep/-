package API;

public class StaticApi {
	
	public static void test1() {
		System.out.println("这是本类中一个静态方法，直接可以调用");
	}
	//static 静态关键字，多个对象存储同一对象，同班同学的教室名字
	//使用static，不在属于对象，属于类共享，所有的类均共享这个变量
	
	
	
	//static修饰方法(静态方法)，静态方法属于类的，而不属于对象的
	//1、没有使用static修饰的方法，必须通过对象名字进行调用，需要创建对象
	//2、使用static修饰的方法，可以通过事类名称进行调用(两者都可以，但是推荐类名称 )
	//3、对于本类中的静态方法，类名称是可以省略的
	//4、静态只能访问静态，不能访问非静态，内存中先有静态，后有非静态
	//5、静态方法中不能使用this关键字
	
	
	/*
	 public class test{

	 static{
	 
	 //静态代码块的内容
	 }
	 }*/
	
	//静态代码块首次用到只执行唯一一次，优先于非静态执行(优先执行)
	public static void main(String[] args) {
		test1();//没有使用类名称进行调用
		Static_class static_class1=new Static_class();
		Static_class static_class2=new Static_class();
	}

}
