import java.util.Random;
import java.util.Scanner;
public class ��Ŀ2_8 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("������һ����λ���Ĳ�Ʊ��");
		Random rand = new Random();
		int guess=in.nextInt(),right=rand.nextInt(1000);
		do{
			if(guess>right)
				System.out.print("����������������룺");
			else if(guess<right)
				System.out.print("�����С�����������룺");
			guess=in.nextInt();
		}while(guess!=right);
		System.out.println("��ϲ�н�,��Ʊ������"+right);
	}
}
