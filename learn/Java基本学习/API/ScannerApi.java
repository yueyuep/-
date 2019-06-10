package API;
//只有java.lang下的包不需要进行导包
import java.util.Scanner;
public class ScannerApi {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.err.println("===============");
	System.err.println("Please enter the num");
	System.err.println("Please enter the string");
	String string=sc.next();
	int num=sc.nextInt();
	System.err.println("The num is: "+num+"and the string is"+string);
}
}
