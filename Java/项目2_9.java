import java.util.Scanner;
public class ��Ŀ2_9 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("����������10��ѧ���ĳɼ�:");
		int score[]=new int[10],i,average=0;//�������ϣ�ѭ����ƽ����
		for(i=0;i<10;i++) {
			score[i]=in.nextInt();
			average+=score[i];
		}
		average/=10;
		System.out.println("ƽ����Ϊ"+average+"������Ϊ����ƽ���ֵķ���");
		for(i=0;i<10;i++)
			if(score[i]>average)
				System.out.print(score[i]+" ");
	}

}
