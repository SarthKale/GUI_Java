import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FDemo extends JFrame implements KeyListener {
	JButton b;  JPasswordField tx2;  JLabel un, up;  JTextField tx1;
	
	FDemo() {
		Font f = new Font("Arial Black", Font.BOLD, 40);
		setLayout(null);
		
		setTitle("Login Page");
		setResizable(false); 
		
		un = new JLabel("UserName ");
		un.setSize(200,30);
		un.setLocation(100,100);
		un.setBackground(Color.cyan);
		add(un);
		tx1 = new JTextField("Enter Name");
		tx1.setSize(250,30);
		tx1.setLocation(350,100);
		tx1.setForeground(Color.gray);
		add(tx1);
		
		up = new JLabel("Password ");
		up.setSize(200,30);
		up.setLocation(100,180);
		up.setBackground(Color.cyan);
		add(up);
		tx2 = new JPasswordField("Enter Password");
		tx2.setSize(250,30);
		tx2.setLocation(350,180);
		tx2.setEchoChar((char)0);
		tx2.setForeground(Color.gray);
		add(tx2);
		
		tx1.addKeyListener(this);
		tx2.addKeyListener(this);
		
		b = new JButton("Login");
		b.setSize(100,30);
		b.setLocation(260,250);
		add(b);
	}
	
	public void keyPressed(KeyEvent e) {
		if(tx1.isFocusOwner())
		{
		String s1 = tx1.getText();
		if(s1.equals("Enter Name")){
			tx1.setText("");
			tx1.setForeground(Color.black);
		}
		}
		
		if(tx2.isFocusOwner())
		{
		String s1 = tx2.getText();
		if(s1.equals("Enter Password")){
			tx2.setText("");
			tx2.setForeground(Color.black);
			tx2.setEchoChar('*');
		}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(tx1.isFocusOwner())
		{
		String s1 = tx1.getText().trim();
		if(s1.equals("")){
			tx1.setText("Enter Name");
			tx1.setForeground(Color.gray);
		}
		}
		
		if(tx2.isFocusOwner())
		{
		String s1 = tx2.getText().trim();
		if(s1.equals("")){
			tx2.setText("Enter Password");
			tx2.setForeground(Color.gray);
		}
		}
	}
	
	public void keyTyped(KeyEvent e) {}
}

class Login {
	public static void main(String SK []) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(700,500);
		f.setLocation(100, 100);
		f.setBackground(Color.cyan);
		//gfgjhk
	}
}