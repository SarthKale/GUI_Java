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
		
		g.setColor(Color.red);
		g.fillRect(80,100,20,500);
		g.fillRect(60,600,60,20);
		g.fillRect(40,620,100,20);
		g.fillRect(20,640,140,20);
		
		g.setColor(Color.blue);
		for(int i=1; i<=24; i++) {
			try {Thread.sleep(200);} 
			catch(Exception e) {}
			g.fillArc(225,225,50,50,sa,ma);
			sa= sa+15;
		}
	}
}

//g.drawOval(150,100,50,50);

class flag {
	public static void main(String Ar[]) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(100,100);
		f.setBackground(Color.cyan);
		f.setForeground(Color.white);
	}
}