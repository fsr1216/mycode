import java.util.*;
class bank{
	private String bank_id,user_name,create_time,id_card_num,password;//�˺š���������������ʱ�䡢���֤���롢����
	private double balance;//������
	bank(String a,String b,String c,String d,double e,String key){ //�вι���
		bank_id=a;
		user_name=b;
		create_time=c;
		id_card_num=d;
		balance=e;
		password=key;
	}
	public String get_id() { //��ȡ����
		return bank_id;
	}
	public String get_name() {//��ȡ����
		return user_name;
	}
	public String get_card_num() {//��ȡ���п���
		return id_card_num;
	}
	public String get_create_time() {//��ȡע��ʱ��
		return create_time;
	}
	public double get_balance() {//��ȡ������
		return balance;
	}
	public void edit_key(String key) {//�޸�����
		System.out.print("�������µ�����");
		password=key;
	}
	public boolean check_id(String press_id) {//�˺���֤
		return press_id.equals(bank_id);
	}
	public boolean check_key(String press_key) {//������֤
		return press_key.equals(password);
	}
	public void coustom(double price) { //����,����drawingȡ��
		if(price>balance)
			System.out.println("����");//ͬʱ�����˿�ʧ�ܣ�����ʹ��boolean����
		else {
			System.out.println("��ԭ����"+balance+"\n��ȡ��/���ѣ�"+price);
			balance-=price;
			System.out.println("���������Ϊ��"+balance);
		}
	}
	public void deposit(double price) {//��Ǯ
		System.out.println("��ԭ����"+balance+"\n�ִ��룺"+price);
		balance+=price;
		System.out.println("���������Ϊ��"+balance);
	}
}
public class Bank_info {
	static Scanner in =new Scanner(System.in);
	static bank user[]=new bank[100];
	static int u=1;//����ڼ����û�
	static void sign_in() {//����
		String id,key;
		boolean ctrl=false;//�����ж�
		int choose,my;
		double price = 0;
		System.out.print("�����뿨�ţ�");
		id=in.next();
		//id+=in.nextLine();
		System.out.print("���������룺");
		key=in.next();
		for(my=0;my<u;my++) {
			if(user[my].check_id(id) && user[my].check_key(key)) {				
				ctrl=true;
				break;//ʡʱ�䣬ͬʱ�����ʱ��my���
			}
		}
		if(ctrl)
			System.out.println("��¼�ɹ�");
		else 
			System.out.println("�˺Ų�����/�������");
		while(ctrl) {
			choose=my=0;
			System.out.print("1���鿴������Ϣ 2���޸����� 3��ȡ�� 4����� 5���ǳ���");
			try {
				choose=in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("����������");
				@SuppressWarnings("unused")
				String clear = in.next();
			}
			if(choose==1)
				System.out.println("�˺ţ�"+user[my].get_id()+"\n������"+user[my].get_name()+"\nע��ʱ��"+user[my].get_create_time()+"\n���֤�ţ�"+user[my].get_card_num()+"\n���"+user[my].get_balance());
			else if(choose==2) {
				System.out.print("�����������룺");
				key=in.next();
				//key+=in.nextLine();
				user[my].edit_key(key);
			}
			else if(choose==3) {
				System.out.print("������ȡ��Ǯ����");
				try {
					price=in.nextDouble();
					user[my].coustom(price);
				}
				catch(InputMismatchException e) {
					System.out.println("��������ֵ");
					@SuppressWarnings("unused")
					String clear = in.next();
				}
			}
			else if(choose==4) {
				System.out.print("���������Ǯ����");
				try {
					price=in.nextDouble();
					user[my].deposit(price);
				}
				catch(InputMismatchException e) {
					System.out.println("��������ֵ");
					@SuppressWarnings("unused")
					String clear = in.next();
				}
			}
			else if(choose==5) {
				System.out.println("��л����ʹ��");
				ctrl=false;//����break
			}
			else
				System.out.println("��������");
		}
	}
	static void sign_up(){//����
		String id,name,time,id_card,key1 = null,key2 = null;
		System.out.print("�����뿨�ţ�");
		id=in.next();
		//id+=in.nextLine();
		System.out.print("������������");
		name=in.next();
		System.out.print("���������֤�ţ�");
		id_card=in.next();
		System.out.print("������ע��ʱ�� ��/��/�գ�");
		time=in.next();
		while(true) {
			System.out.print("���������룺");
			key1=in.next();
			System.out.print("���ٴ�������һ�����룺");
			key2=in.next();
			if(key1.equals(key2))
				break;
			else
				System.out.println("���������������������");
		}
		user[u]=new bank(id,name,time,id_card,0,key1);
	}
	static void ice() {//�̶�����Ϣ
		user[0]=new bank("1740611017","ice","20181226","430220",0,"123");
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ice();//�̶�����һ���˻�
		boolean exit=true;
		int choose=0;
		while(exit) {
			choose=0;//��ʼ�������´��������ʱ��Ĭ���ϴ�ѡ��
			System.out.print("��ӭ����XX����\n1������  2�������˻� 3���˳� 4������ָ��\n��ѡ������Ҫ�ķ���");
			try {
				choose=in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("����������");
				@SuppressWarnings("unused")
				String clear = in.next(); //������ѭ��
			}
			if(choose==1) {
				if(u<100) {
					sign_up();
					u++;
				}
				else
					System.out.println("�洢�ռ�����");
			}
			else if(choose==2) {
				if(u>0)
					sign_in();
				else
					System.out.println("���û�");
			}
			else if(choose==3) {
				System.out.println("��л����ʹ��");
				exit=false;//����break
			}
			else if(choose==4)
				u=1;
			else {
				System.out.println("�����������");
			}
		}
	}

}
