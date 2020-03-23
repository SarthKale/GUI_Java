import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener {
	int c1, c2, c3;
	Button b1, b2, b3;
	boolean rec=false, arc=false, oval=false;
	FDemo() {
		Font f = new Font("Arial Black", Font.BOLD, 50);
		setFont(f);
		setLayout(null);
		Label intro1 = new Label("Press the Buttons to");
		intro1.setSize(550,100);
		intro1.setLocation(100,100);
		add(intro1);
		Label intro2 = new Label(" see the Magic");
		intro2.setSize(550,100);
		intro2.setLocation(100,200);
		add(intro2);
		b1 = new Button("Rec");
		b1.setSize(100,100);
		b1.setLocation(100,350);
		add(b1);
		b2 = new Button("Arc");
		b2.setSize(100,100);
		b2.setLocation(300,350);
		add(b2);
		b3 = new Button("Oval");
		b3.setSize(150,100);
		b3.setLocation(500,350);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			rec = true;
			arc=false; oval=false; 
		}
		
		if(e.getSource()==b2) {
			arc = true;
			rec=false; oval=false;
		}
		
		if(e.getSource()==b3) {
			oval = true;
			rec=false; arc=false;
		}
		
		repaint();
		
	}
	
	public void paint(Graphics g) {
		
		int x=100, y=500; 
		if(rec) {
			
			c1 = (int)Math.round(Math.random()*225);
			c2 = (int)Math.round(Math.random()*225);
			c3 = (int)Math.round(Math.random()*225);
			
			Color c = new Color(c1, c2, c3);
			g.setColor(c);
			g.fillRect(x, y, 300, 200);

		}
		if(arc) {
			
			c1 = (int)Math.round(Math.random()*225);
			c2 = (int)Math.round(Math.random()*225);
			c3 = (int)Math.round(Math.random()*225);
			
			Color c = new Color(c1, c2, c3);
			g.setColor(c);
			g.fillArc(x,y,300,200,0,-180);
		}
		if(oval) {
			
			c1 = (int)Math.round(Math.random()*225);
			c2 = (int)Math.round(Math.random()*225);
			c3 = (int)Math.round(Math.random()*225);
			
			Color c = new Color(c1, c2, c3);
			g.setColor(c);
			g.fillOval(x, y, 300, 200);
		}
	}
}

	
class shapes {
	public static void main(String SK [] ) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(750,900);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
	}
}