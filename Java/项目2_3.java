import java.util.Scanner;
public class ��Ŀ2_3 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("����������2���������x1,y2��x2,y2(û���κα�����):");
		double x1,x2,y1,y2,result;
		x1=in.nextDouble();
		y1=in.nextDouble();
		x2=in.nextDouble();
		y2=in.nextDouble();
		result=Math.pow(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2),0.5);
		System.out.println("2����ľ����ǣ�"+result);
	}

}
