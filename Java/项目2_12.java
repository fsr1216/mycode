import java.util.Random;
public class 项目2_12 {
	static Random rand = new Random();
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a[][]=new int[8][8],b[]=new int[8],i,j,x;//数组，双循环,a为原雇员的信息，前面为7天的时间，最后是总时间，b为排序记录
		for(i=0;i<8;i++) {
			b[i]=i;//排序记录好编号
			a[i][7]=0;//总分初始化
			for(j=0;j<7;j++) {
				a[i][j]=rand.nextInt(10);//0~9内取随机数，方便起见就不搞输入了
				a[i][7]+=a[i][j];//代表总时间持续加
			}
		}
		for(i=0;i<7;i++)//冒泡排序
			for(j=0;j<i-1;j++)
				if(a[j][7]<a[j+1][7]) {
					x=b[j];
					b[j]=b[j+1];
					b[j+1]=x;					
				}
		System.out.println("以下为降序的成绩信息\n     Su M  T  W Th F  Sa 总时间");
		for(i=0;i<8;i++) {
			System.out.print("雇员"+b[i]+"   ");
			for(j=0;j<8;j++)
				System.out.printf("%-6d",a[b[i]][j]);
			System.out.println();
		}
	}

}
