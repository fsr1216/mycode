import java.util.Random;
public class ��Ŀ2_12 {
	static Random rand = new Random();
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[][]=new int[8][8],b[]=new int[8],i,j,x;//���飬˫ѭ��,aΪԭ��Ա����Ϣ��ǰ��Ϊ7���ʱ�䣬�������ʱ�䣬bΪ�����¼
		for(i=0;i<8;i++) {
			b[i]=i;//�����¼�ñ��
			a[i][7]=0;//�ֳܷ�ʼ��
			for(j=0;j<7;j++) {
				a[i][j]=rand.nextInt(10);//0~9��ȡ���������������Ͳ���������
				a[i][7]+=a[i][j];//������ʱ�������
			}
		}
		for(i=0;i<7;i++)//ð������
			for(j=0;j<i-1;j++)
				if(a[j][7]<a[j+1][7]) {
					x=b[j];
					b[j]=b[j+1];
					b[j+1]=x;					
				}
		System.out.println("����Ϊ����ĳɼ���Ϣ\n     Su M  T  W Th F  Sa ��ʱ��");
		for(i=0;i<8;i++) {
			System.out.print("��Ա"+b[i]+"   ");
			for(j=0;j<8;j++)
				System.out.printf("%-6d",a[b[i]][j]);
			System.out.println();
		}
	}

}
