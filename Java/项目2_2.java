import java.util.Scanner;
public class 项目2_2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		double r,h,v;//r和h代表圆柱体的低半径和高,v代表体积
		System.out.println("请输入圆柱体底半径和高");
		r=in.nextDouble();
		h=in.nextDouble();
		v=(r*r*3.141592654)*h;
		System.out.println("圆柱体体积为"+v);
	}

}
