import java.util.Scanner;
public class 项目2_10 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请依次输入10个整数:");
		int a[]=new int[10],i;//数组，循环
		for(i=0;i<10;i++)
			a[i]=in.nextInt();
		System.out.println("以下为逆序输出");
		for(;i>0;i--)
			System.out.print(a[i-1]+" ");
	}

}
