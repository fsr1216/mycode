import java.util.Scanner;

public class 项目2_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        @SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		double t,result;//输入和输出结果
		System.out.println("请输入摄氏度");
		t=in.nextDouble();
		result=(9.0/5)*t+32;
		System.out.println("华氏度="+result);
	}

}
