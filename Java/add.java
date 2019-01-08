//import java.awt.*; 本处无用
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
//import java.util.InputMismatchException; 本处无用，用于try scanner输入字符
public class add extends JFrame implements ActionListener{
	private static final long serialVersionUID = 8229634751654389423L;
	JTextField num1=new JTextField(4);
	JTextField num2=new JTextField(4);
	JTextField sum=new JTextField(8);
	JTextField addButton1=new JTextField("加数");
	JTextField addButton2=new JTextField("被加数"); 
	JButton addit=new JButton("相加");
	JButton clear=new JButton("清除");
	public add(String name){
		super(name); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //退出
		//FlowLayout flo=new FlowLayout(); //跟随设定位置
		setLayout(null); //由个人手动设置位置
		num1.setBounds(120 , 0, 120, 80);
		num2.setBounds(120 , 80, 120, 80);
		sum.setBounds(120, 160, 120, 80);
		addit.setBounds(0, 160, 120, 80);
		addButton1.setBounds(0, 0, 120, 80);
		addButton2.setBounds(0, 80, 120, 80);
		clear.setBounds(240, 160, 120, 80);
		//sum.setBounds(arg0, arg1, arg2, arg3); 代表 位置xy和长宽ab
		add(num1); 
		add(addButton1); 
		add(num2); 
		add(addButton2); 
		add(addit);
		add(sum); 
		add(clear);
		sum.setEditable(false);
		addButton1.setEditable(false); //设置修改与否
		addButton2.setEditable(false);
		addit.addActionListener(this);
		clear.addActionListener(new ActionListener() {//清空方式为文本内容设置空
			public void actionPerformed(ActionEvent e) {
				num1.setText("");
				num2.setText("");
				sum.setText("");
			}
		});
	}
	public void actionPerformed(ActionEvent e){ 
		//JButton addButton2=(JButton)e.getSource(); 
		try {
			double a1=Double.parseDouble(num1.getText()); 
			double a2=Double.parseDouble(num2.getText()); 
			sum.setText(String.valueOf(a2+a1));
		}
		/*
		catch(InputMismatchException error) {
			sum.setText("请输入正确的数值");
			System.out.println("Please enter integer value");
		}
		*/
		catch(Exception error2) {
			sum.setText("请输入正确的数值");
			System.out.println("Please enter correct value");
		}
	}
	public static void main(String[] args) {
		// TODO 
        add sal=new add("加法器");
        sal.setSize(375,280); //设置初始窗体大小
		sal.setVisible(true); //设置总体显示状态与否
	}

}
