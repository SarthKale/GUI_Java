import java.awt.*;

class FDemo extends Frame {
	FDemo() {} 
	public void paint(Graphics g) {
		//g.drawString("Softwaves - Sarthak Kale", 100, 100);
		int sa=0, ma=5;
		
		Color c = new Color(255,128,0);
		Color c1 = new Color(0,64,0);
		g.setColor(c);
		g.fillRect(100,100,300,100);
		g.setColor(Color.white);
		g.fillRect(100,200,300,100);
		g.setColor(c1);
		g.fillRect(100,300,300,100);
		g.setColor(Color.blue);
		g.drawOval(225,225,50,50);
		
		g.drawLine(235,235,265,265);
		for(int i=1; i<=24; i++) {
			g.fillArc(225,225,50,50,sa,ma);
			sa= sa+15;
		}
		g.setColor(Color.red);
		g.fillRect(80,100,20,500);
		
	}
}

//g.drawOval(150,100,50,50);

class test {
	public static void main(String Ar[]) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(100,100);
		f.setBackground(Color.cyan);
		f.setForeground(Color.white);
	}
}