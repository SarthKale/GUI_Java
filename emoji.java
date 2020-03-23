import java.awt.*;

class FDemo extends Frame {
	FDemo() {} 
	public void paint(Graphics g) {
		//g.drawString("Softwaves - Sarthak Kale", 100, 100);
		
		 // Oval for face outline 
		g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150); 
  
        // Ovals for eyes 
        // with black color filled 
        g.setColor(Color.BLACK); 
        g.fillOval(120, 120, 15, 15); 
        g.fillOval(175, 120, 15, 15); 
  
        // Arc for the smile 
        g.drawArc(115,150,78,50,0,-180);
		
	}
}

//g.drawOval(150,100,50,50);

class emoji {
	public static void main(String Ar[]) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(100,100);
		f.setBackground(Color.cyan);
		f.setForeground(Color.white);
	}
}