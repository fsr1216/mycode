//import java.awt.*; ��������
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
//import java.util.InputMismatchException; �������ã�����try scanner�����ַ�
public class add extends JFrame implements ActionListener{
	private static final long serialVersionUID = 8229634751654389423L;
	JTextField num1=new JTextField(4);
	JTextField num2=new JTextField(4);
	JTextField sum=new JTextField(8);
	JTextField addButton1=new JTextField("����");
	JTextField addButton2=new JTextField("������"); 
	JButton addit=new JButton("���");
	JButton clear=new JButton("���");
	public add(String name){
		super(name); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�˳�
		//FlowLayout flo=new FlowLayout(); //�����趨λ��
		setLayout(null); //�ɸ����ֶ�����λ��
		num1.setBounds(120 , 0, 120, 80);
		num2.setBounds(120 , 80, 120, 80);
		sum.setBounds(120, 160, 120, 80);
		addit.setBounds(0, 160, 120, 80);
		addButton1.setBounds(0, 0, 120, 80);
		addButton2.setBounds(0, 80, 120, 80);
		clear.setBounds(240, 160, 120, 80);
		//sum.setBounds(arg0, arg1, arg2, arg3); ���� λ��xy�ͳ���ab
		add(num1); 
		add(addButton1); 
		add(num2); 
		add(addButton2); 
		add(addit);
		add(sum); 
		add(clear);
		sum.setEditable(false);
		addButton1.setEditable(false); //�����޸����
		addButton2.setEditable(false);
		addit.addActionListener(this);
		clear.addActionListener(new ActionListener() {//��շ�ʽΪ�ı��������ÿ�
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
			sum.setText("��������ȷ����ֵ");
			System.out.println("Please enter integer value");
		}
		*/
		catch(Exception error2) {
			sum.setText("��������ȷ����ֵ");
			System.out.println("Please enter correct value");
		}
	}
	public static void main(String[] args) {
		// TODO 
        add sal=new add("�ӷ���");
        sal.setSize(375,280); //���ó�ʼ�����С
		sal.setVisible(true); //����������ʾ״̬���
	}

}
