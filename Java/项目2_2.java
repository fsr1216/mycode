import java.util.Scanner;
public class ��Ŀ2_2 {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
		double r,h,v;//r��h����Բ����ĵͰ뾶�͸�,v�������
		System.out.println("������Բ����װ뾶�͸�");
		r=in.nextDouble();
		h=in.nextDouble();
		v=(r*r*3.141592654)*h;
		System.out.println("Բ�������Ϊ"+v);
	}

}
