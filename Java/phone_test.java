class phone{
	private int phone_number;
	public phone(){}
	void set_phone_num(int a) { //���ñ�������
		this.phone_number=a;
	}
	int get_phone_num() { //��ȡ��������
		return phone_number;
	}
	void call(int a) { //��绰
		System.out.println("����"+a+"��");
	}
	void answer(int a) { //�ӵ绰
		System.out.println(a+"�ĵ绰");
	}
}
interface movephone{ //�ƶ��绰���
	void sent(int num,String message) ; //������Ϣ
	void receive(int num,String message); //������Ϣ
}
class mobilephone extends phone implements movephone{ //�ֻ��ļ̳���ӿ�
	public mobilephone(){}
	void call(int num) {
		System.out.println("�ֻ�����"+num+"��");
	}
	void answer(int num) {
		System.out.println("�����ֻ��յ�����"+num+"�ĵ绰");
	}
	public void sent(int num,String message) {
		System.out.println("��"+num+"������Ϣ��\n"+message);
	}
	public void receive(int num,String message) {
		System.out.println("�����ֻ��յ�����"+num+"����Ϣ��\n"+message);
	}
}
class fixedphone extends phone{ //�̶��绰
	public fixedphone(){}
	void call(int num) {
		System.out.println("�̻�����"+num+"��");
	}
	void answer(int num) {
		System.out.println("���Ĺ̶��绰������"+num+"�ĵ绰");
	}
}
class cordlessphone extends fixedphone{ //�����绰
	private int canmove; //���ƶ�״̬��һ���ж�Ҳ������boolean��true��false���жϣ������Ҳ���int��0��1
	public cordlessphone(){}
	void set_move(int a) {
		this.canmove=a;
	}
	int get_move() {
		return canmove;
	}
	void call(int num) {
		System.out.println("�����绰����"+num+"��");
	}
	void answer(int num) {
		System.out.println("���������绰������"+num+"�ĵ绰");
	}
}
public class phone_test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		phone phones[]=new phone[5];
		phones[0]=new phone();
		phones[0].set_phone_num(31900276);
		phones[1]=new phone();
		phones[1].set_phone_num(23774142);
		phones[2]=new mobilephone();
		phones[2].set_phone_num(133220116);
		phones[3]=new fixedphone();
		phones[3].set_phone_num(63615612);
		phones[4]=new cordlessphone();
		phones[4].set_phone_num(34156151);
		phones[4].call(64676742); //���ò���
	}

}
