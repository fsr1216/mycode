import java.util.*;
public class ��������Ϸ{
	static void guess(){
		Scanner in =new Scanner(System.in);
		int counter=0,guessnumber=(int)(Math.random()*100),input;
		//int����ǿ�ƴ�doubleת����int,Math.random()��[0,1)�����ڵ�����������Գ���100����
		while(counter!=-1){
			counter++;
			System.out.print("������²������");
			input=in.nextInt();
			if(input<guessnumber){
				System.out.println("����̫С��");
				continue;
			}
			if(input>guessnumber){
				System.out.println("����̫����");
				continue;
			}
			if(input==guessnumber){
				System.out.println("������ȣ���ǰ����Ϊ"+guessnumber+"�µĴ���Ϊ"+counter);
				break;
			}
		}
	}
	public static void main(String[] args){
		guess();
	}
}
