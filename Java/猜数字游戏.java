import java.util.*;
public class 猜数字游戏{
	static void guess(){
		Scanner in =new Scanner(System.in);
		int counter=0,guessnumber=(int)(Math.random()*100),input;
		//int代表强制从double转换成int,Math.random()是[0,1)区间内的随机数，所以乘以100扩大
		while(counter!=-1){
			counter++;
			System.out.print("请输入猜测的数字");
			input=in.nextInt();
			if(input<guessnumber){
				System.out.println("输入太小了");
				continue;
			}
			if(input>guessnumber){
				System.out.println("输入太大了");
				continue;
			}
			if(input==guessnumber){
				System.out.println("输入相等，当前的数为"+guessnumber+"猜的次数为"+counter);
				break;
			}
		}
	}
	public static void main(String[] args){
		guess();
	}
}
