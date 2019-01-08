import java.util.*;
class bank{
	private String bank_id,user_name,create_time,id_card_num,password;//账号、储户姓名、开户时间、身份证号码、密码
	private double balance;//存款余额
	bank(String a,String b,String c,String d,double e,String key){ //有参构造
		bank_id=a;
		user_name=b;
		create_time=c;
		id_card_num=d;
		balance=e;
		password=key;
	}
	public String get_id() { //获取卡号
		return bank_id;
	}
	public String get_name() {//获取名字
		return user_name;
	}
	public String get_card_num() {//获取银行卡号
		return id_card_num;
	}
	public String get_create_time() {//获取注册时间
		return create_time;
	}
	public double get_balance() {//获取存款余额
		return balance;
	}
	public void edit_key(String key) {//修改密码
		System.out.print("请输入新的密码");
		password=key;
	}
	public boolean check_id(String press_id) {//账号验证
		return press_id.equals(bank_id);
	}
	public boolean check_key(String press_key) {//密码验证
		return press_key.equals(password);
	}
	public void coustom(double price) { //消费,或者drawing取款
		if(price>balance)
			System.out.println("余额不足");//同时返回退款失败，可以使用boolean函数
		else {
			System.out.println("您原有余额："+balance+"\n现取出/消费："+price);
			balance-=price;
			System.out.println("您现在余额为："+balance);
		}
	}
	public void deposit(double price) {//存钱
		System.out.println("您原有余额："+balance+"\n现存入："+price);
		balance+=price;
		System.out.println("您现在余额为："+balance);
	}
}
public class Bank_info {
	static Scanner in =new Scanner(System.in);
	static bank user[]=new bank[100];
	static int u=1;//代表第几个用户
	static void sign_in() {//登入
		String id,key;
		boolean ctrl=false;//控制判定
		int choose,my;
		double price = 0;
		System.out.print("请输入卡号：");
		id=in.next();
		//id+=in.nextLine();
		System.out.print("请输入密码：");
		key=in.next();
		for(my=0;my<u;my++) {
			if(user[my].check_id(id) && user[my].check_key(key)) {				
				ctrl=true;
				break;//省时间，同时避免此时的my溢出
			}
		}
		if(ctrl)
			System.out.println("登录成功");
		else 
			System.out.println("账号不存在/密码错误");
		while(ctrl) {
			choose=my=0;
			System.out.print("1、查看个人信息 2、修改密码 3、取款 4、存款 5、登出：");
			try {
				choose=in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数");
				@SuppressWarnings("unused")
				String clear = in.next();
			}
			if(choose==1)
				System.out.println("账号："+user[my].get_id()+"\n姓名："+user[my].get_name()+"\n注册时间"+user[my].get_create_time()+"\n身份证号："+user[my].get_card_num()+"\n余额"+user[my].get_balance());
			else if(choose==2) {
				System.out.print("请输入新密码：");
				key=in.next();
				//key+=in.nextLine();
				user[my].edit_key(key);
			}
			else if(choose==3) {
				System.out.print("请输入取出钱数：");
				try {
					price=in.nextDouble();
					user[my].coustom(price);
				}
				catch(InputMismatchException e) {
					System.out.println("请输入数值");
					@SuppressWarnings("unused")
					String clear = in.next();
				}
			}
			else if(choose==4) {
				System.out.print("请输入存入钱数：");
				try {
					price=in.nextDouble();
					user[my].deposit(price);
				}
				catch(InputMismatchException e) {
					System.out.println("请输入数值");
					@SuppressWarnings("unused")
					String clear = in.next();
				}
			}
			else if(choose==5) {
				System.out.println("感谢您的使用");
				ctrl=false;//或者break
			}
			else
				System.out.println("输入有误");
		}
	}
	static void sign_up(){//开户
		String id,name,time,id_card,key1 = null,key2 = null;
		System.out.print("请输入卡号：");
		id=in.next();
		//id+=in.nextLine();
		System.out.print("请输入姓名：");
		name=in.next();
		System.out.print("请输入身份证号：");
		id_card=in.next();
		System.out.print("请输入注册时间 年/月/日：");
		time=in.next();
		while(true) {
			System.out.print("请输入密码：");
			key1=in.next();
			System.out.print("请再次输入上一个密码：");
			key2=in.next();
			if(key1.equals(key2))
				break;
			else
				System.out.println("二次密码错误，请重新输入");
		}
		user[u]=new bank(id,name,time,id_card,0,key1);
	}
	static void ice() {//固定的信息
		user[0]=new bank("1740611017","ice","20181226","430220",0,"123");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ice();//固定创建一个账户
		boolean exit=true;
		int choose=0;
		while(exit) {
			choose=0;//初始化避免下次输入出错时候默认上次选择
			System.out.print("欢迎来到XX银行\n1、开户  2、登入账户 3、退出 4、清理指针\n请选择您需要的服务：");
			try {
				choose=in.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("请输入整数");
				@SuppressWarnings("unused")
				String clear = in.next(); //避免死循环
			}
			if(choose==1) {
				if(u<100) {
					sign_up();
					u++;
				}
				else
					System.out.println("存储空间已满");
			}
			else if(choose==2) {
				if(u>0)
					sign_in();
				else
					System.out.println("无用户");
			}
			else if(choose==3) {
				System.out.println("感谢您的使用");
				exit=false;//或者break
			}
			else if(choose==4)
				u=1;
			else {
				System.out.println("输入口令有误");
			}
		}
	}

}
