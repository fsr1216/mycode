import java.util.Scanner;
public class ��Ŀ2_10 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("����������10������:");
		int a[]=new int[10],i;//���飬ѭ��
		for(i=0;i<10;i++)
			a[i]=in.nextInt();
		System.out.println("����Ϊ�������");
		for(;i>0;i--)
			System.out.print(a[i-1]+" ");
	}

}
