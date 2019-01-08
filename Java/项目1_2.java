import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//输出红色字体“这是一个Java Applet!"
public class 项目1_2  extends Applet{
	private static final long serialVersionUID = 8064655789993209907L;

	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawString("这是一个Java Applet!", 10, 50);
	}

}
