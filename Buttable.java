import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener {
	TextField tx1;
	int n;
	boolean bool = false;
	FDemo() {
		Font f = new Font("Arial Black", Font.BOLD, 40);
		setFont(f);
		setLayout(null);
		setTitle("Colored Tables");
		
		Label lt = new Label("Enter Number till which you want the table:");
		lt.setSize(200,100);
		lt.setLocation(100,100);
		add(lt);
		tx1 = new TextField();
		tx1.setSize(100,100);
		tx1.setLocation(400,100);
		add(tx1);
		
		String s1 = tx1.getText();
		n = Integer.parseInt(s1);
		Button b = new Button("Click");
		b.setSize(100,100);
		b.setLocation(350,200);
		add(b);
		b.addActionListener(this);
	}
	
	public void paint(Graphics g) {
		int r1,g1,b1;
		int x=100, y=350;
		
		if(bool) {
			for(int i=1; i<=n; i++) {
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
	
	public void actionPerformed(ActionEvent e) {
		bool = true;
		repaint();
	}
}

class Buttable {
	public static void main(String Args[]) {
		FDemo f = new FDemo();
		
		f.setVisible(true);
		f.setSize(800,1200);
		f.setLocation(100,100);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
		
	}
}