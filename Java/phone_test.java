class phone{
	private int phone_number;
	public phone(){}
	void set_phone_num(int a) { //设置本机号码
		this.phone_number=a;
	}
	int get_phone_num() { //获取本机号码
		return phone_number;
	}
	void call(int a) { //打电话
		System.out.println("呼叫"+a+"中");
	}
	void answer(int a) { //接电话
		System.out.println(a+"的电话");
	}
}
interface movephone{ //移动电话借口
	void sent(int num,String message) ; //发送信息
	void receive(int num,String message); //接收信息
}
class mobilephone extends phone implements movephone{ //手机的继承与接口
	public mobilephone(){}
	void call(int num) {
		System.out.println("手机呼叫"+num+"中");
	}
	void answer(int num) {
		System.out.println("您的手机收到来自"+num+"的电话");
	}
	public void sent(int num,String message) {
		System.out.println("向"+num+"发送信息：\n"+message);
	}
	public void receive(int num,String message) {
		System.out.println("您的手机收到来自"+num+"的信息：\n"+message);
	}
}
class fixedphone extends phone{ //固定电话
	public fixedphone(){}
	void call(int num) {
		System.out.println("固话呼叫"+num+"中");
	}
	void answer(int num) {
		System.out.println("您的固定电话有来自"+num+"的电话");
	}
}
class cordlessphone extends fixedphone{ //无绳电话
	private int canmove; //可移动状态，一般判断也可以用boolean中true和false来判断，这里我采用int的0和1
	public cordlessphone(){}
	void set_move(int a) {
		this.canmove=a;
	}
	int get_move() {
		return canmove;
	}
	void call(int num) {
		System.out.println("无绳电话呼叫"+num+"中");
	}
	void answer(int num) {
		System.out.println("您的无绳电话有来自"+num+"的电话");
	}
}
public class phone_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		phones[4].call(64676742); //调用测试
	}

}
