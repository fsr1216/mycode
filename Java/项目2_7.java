import java.util.Scanner;
public class 项目2_7 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请输入一个3位数的整数(百位数不能为0）:");
		int a=in.nextInt(),b,c;
		b=a/100;
		c=a%100%10;
		if(b==c)
			System.out.println("该数字为回文数");
		else
			System.out.println("该数字不是回文数");
	}

}
