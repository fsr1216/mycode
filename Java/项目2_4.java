
public class 项目2_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		float a=1;
		int i;
		System.out.println("a   b   pow(a,b)");
		for(i=0;i<5;i++) {
			System.out.printf("%-4d%-4d%-4d\n",(int)a,(int)a+1,(int)Math.pow(a, a+1));
			a++;
		}
	}

}
