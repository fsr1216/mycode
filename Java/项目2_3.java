import java.util.Scanner;
public class 项目2_3 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请依次输入2个点的坐标x1,y2和x2,y2(没有任何标点符号):");
		double x1,x2,y1,y2,result;
		x1=in.nextDouble();
		y1=in.nextDouble();
		x2=in.nextDouble();
		y2=in.nextDouble();
		result=Math.pow(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2),0.5);
		System.out.println("2个点的距离是："+result);
	}

}
