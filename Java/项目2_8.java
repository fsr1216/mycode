import java.util.Random;
import java.util.Scanner;
public class 项目2_8 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("请输入一个三位数的彩票：");
		Random rand = new Random();
		int guess=in.nextInt(),right=rand.nextInt(1000);
		do{
			if(guess>right)
				System.out.print("输入过大，请重新输入：");
			else if(guess<right)
				System.out.print("输入过小，请重新输入：");
			guess=in.nextInt();
		}while(guess!=right);
		System.out.println("恭喜中奖,彩票号码是"+right);
	}
}
