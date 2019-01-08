import java.util.Random;
import java.util.Scanner;
public class 项目2_11 {
	static Random rand = new Random();
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请输入总共随机多少个数字，输出1~100出现的次数：");
		int amount=in.nextInt(),count[]=new int[100],i,j,num;//计算，双循环,当前数字
		for(i=0;i<100;i++)
			count[i]=0;
		for(i=0;i<amount;i++) {
			num=rand.nextInt(100)+1;//随机抽取1~100的数
			for(j=0;j<100;j++)
				if(num==j)
					count[j]++;//当相等时计数加一
		}
		System.out.println("以下为1~100输出次数统计表");
		for(i=0;i<100;i++)
			System.out.printf("%d %d\n",i+1,count[i]);
	}

}
