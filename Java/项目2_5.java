import java.util.Random;

public class 项目2_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("This month is:");
		Random rand = new Random();
		int month=rand.nextInt(12)+1;
		if(month==1)
			System.out.println("January");
		else if(month==2)
			System.out.println("February");
		else if(month==3)
			System.out.println("March");
		else if(month==4)
			System.out.println("April");
		else if(month==5)
			System.out.println("May");
		else if(month==6)
			System.out.println("June");
		else if(month==7)
			System.out.println("July");
		else if(month==8)
			System.out.println("Augest");
		else if(month==9)
			System.out.println("September");
		else if(month==10)
			System.out.println("October");
		else if(month==11)
			System.out.println("November");
		if(month==12)
			System.out.println("December");
	}

}
