import java.util.*;
public class bmi{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("�������Ա�(m��������,f����Ů��)�����(m)������(Kg)");
		String s = in.next();
		char a;
		Double high,weight,bmi;//��ߣ����أ���֬��
		a=s.charAt(0); //�ַ�����
		high=in.nextDouble();
		weight=in.nextDouble();
		bmi=weight/(high*high);
		System.out.println("������ָ��Ϊ"+bmi);
		if((a=='m' && bmi <20) || (a=='f' && bmi<19))
			System.out.println("���˹���");
		else if((a=='m' && (bmi >=20 && bmi<25) || (a=='f' && bmi >=19 && bmi<24)))
			System.out.println("��������");
		else if((a=='m' && (bmi >=25 && bmi<30) || (a=='f' && bmi >=24 && bmi<29)))
			System.out.println("���˹���");
		else if((a=='m' && (bmi >=30 && bmi<35) || (a=='f' && bmi >=29 && bmi<34)))
			System.out.println("���˷���");
		else if((a=='m' && bmi >35) || (a=='f' && bmi>34))
			System.out.println("���˷ǳ�����");
		else
			System.out.println("������Ա�����");
	}
	
}
