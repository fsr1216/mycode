import java.util.*;
public class bmi{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("请输入性别(m代表男性,f代表女性)，身高(m)，体重(Kg)");
		String s = in.next();
		char a;
		Double high,weight,bmi;//身高，体重，体脂数
		a=s.charAt(0); //字符输入
		high=in.nextDouble();
		weight=in.nextDouble();
		bmi=weight/(high*high);
		System.out.println("此人体指数为"+bmi);
		if((a=='m' && bmi <20) || (a=='f' && bmi<19))
			System.out.println("此人过轻");
		else if((a=='m' && (bmi >=20 && bmi<25) || (a=='f' && bmi >=19 && bmi<24)))
			System.out.println("此人适中");
		else if((a=='m' && (bmi >=25 && bmi<30) || (a=='f' && bmi >=24 && bmi<29)))
			System.out.println("此人过重");
		else if((a=='m' && (bmi >=30 && bmi<35) || (a=='f' && bmi >=29 && bmi<34)))
			System.out.println("此人肥胖");
		else if((a=='m' && bmi >35) || (a=='f' && bmi>34))
			System.out.println("此人非常肥胖");
		else
			System.out.println("输入的性别有误");
	}
	
}
