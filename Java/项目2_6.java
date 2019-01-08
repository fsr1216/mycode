import java.util.Random;
public class 项目2_6 {
	public static void main(String[] args) {
		Random rand = new Random();
		int a=rand.nextInt(100)+1,b=rand.nextInt(100)+1,result=a+b;
		System.out.println("2个随机小于100的整数的和为："+result);
	}
}
