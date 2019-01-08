import java.util.Scanner;
public class bank {
	String cardnum;
	String name;
	String time;
	String idcard;
	double balance=5000.00;
	Scanner sc=new Scanner(System.in);
	String clear=null;
	bank(){
		
	}
	public void setinfo(String num,String n,String t,String id,double b){
		cardnum=num;
		name=n;
		time=t;
		idcard=id;
		balance=b;
	}
	public void consumer(double money){ 
		double d=balance-money;
		balance=d;
	}
	public void saving(double money){
		double d=balance+money;
		balance=d;
	}
	public void cost(){
		while(true){
			try{
				System.out.println("\n\nPress your pay money");
				this.consumer(sc.nextDouble());
				break;
			}
			catch(Exception error){
				System.out.println("Please enter the double value");
				clear=sc.next();
			}
		}
		System.out.println("Now you have "+this.balance+" dollars");
	}
	public void save(){
		while(true){
			try{
				System.out.println("Press your saving money");
				this.saving(sc.nextDouble());
				break;
			}
			catch(Exception error){
				System.out.println("Please enter the double value");
				clear=sc.next();
			}
		}
		System.out.println("Now you have "+this.balance+" dollars");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank bc=new bank();
		char choose = '0';
		bc.setinfo("20180001", "jack", "20180911", "1474562719", 800.00);
		System.out.println("Your card ID is "+bc.cardnum);
		System.out.println("Your name is "+bc.name);
		System.out.println("Your idcard number is "+bc.idcard);
		System.out.println("Your open an account time is "+bc.time);
		System.out.println("Your balance is $"+bc.balance);
		while(choose!='3'){
			System.out.println("Enter your choose:(1)cost(2)save(3)exit");
			choose=bc.sc.next().charAt(0);
			switch(choose){
				case '1':bc.cost();break;
				case '2':bc.save();break;
				case '3':break;
				default:System.out.println("Enter error,Please try again");
			}
		}
		System.out.println("Thank you to used\nFinally you have "+bc.balance+" dollars");
	}

}
