import java.awt.*;

class FDemo extends Frame {
	FDemo() {}
	
	public void paint(Graphics g) {
		int r1,g1,b1;
		int x=100, y=100;
		Font f = new Font("Times New Roman", Font.BOLD, 50);
		setFont(f);
	
		for(int i=1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				try{ Thread.sleep(200); } catch(Exception e) {}
				r1 = (int)Math.round(Math.random()*225);
				g1 = (int)Math.round(Math.random()*225);
				b1 = (int)Math.round(Math.random()*225);
				
				Color c = new Color(r1,g1,b1);
				g.setColor(c);
				g.drawString(""+(i*j),x,y);
				x = x+70;
			}
			x=100;
			y = y+70;
		}
	}
}

class ColorNum {
	public static void main(String Args[]) {
		FDemo f = new FDemo();
		
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
		
	}
}