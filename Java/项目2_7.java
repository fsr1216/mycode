import java.util.Scanner;
public class ��Ŀ2_7 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("������һ��3λ��������(��λ������Ϊ0��:");
		int a=in.nextInt(),b,c;
		b=a/100;
		c=a%100%10;
		if(b==c)
			System.out.println("������Ϊ������");
		else
			System.out.println("�����ֲ��ǻ�����");
	}

}
