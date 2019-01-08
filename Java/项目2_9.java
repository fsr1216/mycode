import java.util.Scanner;
public class 项目2_9 {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.print("请依次输入10个学生的成绩:");
		int score[]=new int[10],i,average=0;//分数集合，循环，平均分
		for(i=0;i<10;i++) {
			score[i]=in.nextInt();
			average+=score[i];
		}
		average/=10;
		System.out.println("平均分为"+average+"，以下为大于平均分的分数");
		for(i=0;i<10;i++)
			if(score[i]>average)
				System.out.print(score[i]+" ");
	}

}
