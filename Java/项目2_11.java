import java.util.Random;
import java.util.Scanner;
public class ��Ŀ2_11 {
	static Random rand = new Random();
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("�������ܹ�������ٸ����֣����1~100���ֵĴ�����");
		int amount=in.nextInt(),count[]=new int[100],i,j,num;//���㣬˫ѭ��,��ǰ����
		for(i=0;i<100;i++)
			count[i]=0;
		for(i=0;i<amount;i++) {
			num=rand.nextInt(100)+1;//�����ȡ1~100����
			for(j=0;j<100;j++)
				if(num==j)
					count[j]++;//�����ʱ������һ
		}
		System.out.println("����Ϊ1~100�������ͳ�Ʊ�");
		for(i=0;i<100;i++)
			System.out.printf("%d %d\n",i+1,count[i]);
	}

}
