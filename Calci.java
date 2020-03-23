import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	Button sum, dif, pro, que, eql;
	Button clr, prc, zero, pont;
	TextField tx1;
	String s1, s2, s3, s4, s5;
	int c,n;
	
	FDemo() {
		Font f = new Font("Arial Black", Font.BOLD, 30);
		setFont(f);
		setLayout(null);
		setResizable(false);
		tx1 = new TextField(15);
		tx1.setSize(400,100);
		tx1.setLocation(100,100);
		add(tx1);
		b1 = new Button("7");
		b1.setSize(100,100);
		b1.setLocation(100,200);
		add(b1);
		b2 = new Button("8");
		b2.setSize(100,100);
		b2.setLocation(200,200);
		add(b2);
		b3 = new Button("9");
		b3.setSize(100,100);
		b3.setLocation(300,200);
		add(b3);
		b4 = new Button("4");
		b4.setSize(100,100);
		b4.setLocation(100,300);
		add(b4);
		b5 = new Button("5");
		b5.setSize(100,100);
		b5.setLocation(200,300);
		add(b5);
		b6 = new Button("6");
		b6.setSize(100,100);
		b6.setLocation(300,300);
		add(b6);
		b7 = new Button("1");
		b7.setSize(100,100);
		b7.setLocation(100,400);
		add(b7);
		b8 = new Button("2");
		b8.setSize(100,100);
		b8.setLocation(200,400);
		add(b8);
		b9 = new Button("3");
		b9.setSize(100,100);
		b9.setLocation(300,400);
		add(b9);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		sum = new Button("+");
		sum.setSize(50,50);
		sum.setLocation(400,200);
		add(sum);
		dif = new Button("-");
		dif.setSize(50,50);
		dif.setLocation(400,250);
		add(dif);
		pro = new Button("x");
		pro.setSize(50,50);
		pro.setLocation(400,300);
		add(pro);
		que = new Button("/");
		que.setSize(50,50);
		que.setLocation(400,350);
		add(que);
		eql = new Button("=");
		eql.setSize(100,100);
		eql.setLocation(400,400);
		add(eql);
		
		sum.addActionListener(this);
		dif.addActionListener(this);
		pro.addActionListener(this);
		que.addActionListener(this);
		eql.addActionListener(this);
		
		clr = new Button("Clr");
		clr.setSize(50,50);
		clr.setLocation(450,200);
		add(clr);
		prc = new Button("%");
		prc.setSize(50,50);
		prc.setLocation(450,250);
		add(prc);
		zero = new Button("0");
		zero.setSize(50,50);
		zero.setLocation(450,300);
		add(zero);
		pont = new Button(".");
		pont.setSize(50,50);
		pont.setLocation(450,350);
		add(pont);
		
		clr.addActionListener(this);
		prc.addActionListener(this);
		zero.addActionListener(this);
		pont.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Ram");
		
		if(e.getSource()==zero) {
            s3 = tx1.getText();
            s4 = "0";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b7) {
            s3 = tx1.getText();
            s4 = "1";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b8) {
            s3 = tx1.getText();
            s4 = "2";
            s5 = s3+s4;
            tx1.setText(s5);
        }
		if(e.getSource()==b9) {
            s3 = tx1.getText();
            s4 = "3";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b4) {
            s3 = tx1.getText();
            s4 = "4";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b5) {
            s3 = tx1.getText();
            s4 = "5";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b6) {
            s3 = tx1.getText();
            s4 = "6";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b1) {
            s3 = tx1.getText();
            s4 = "7";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b2) {
            s3 = tx1.getText();
            s4 = "8";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==b3) {
            s3 = tx1.getText();
            s4 = "9";
            s5 = s3+s4;
            tx1.setText(s5);
        }
        if(e.getSource()==sum) {
            s1 = tx1.getText();
            tx1.setText("");
            c=1;
        }
        if(e.getSource()==dif) {
            s1 = tx1.getText();
            tx1.setText("");
            c=2;
        }
        if(e.getSource()==pro) {
            s1 = tx1.getText();
            tx1.setText("");
            c=3;
        }
        if(e.getSource()==que) {
            s1 = tx1.getText();
            tx1.setText("");
            c=4;
        }
        if(e.getSource()==prc) {
            s1 = tx1.getText();
            tx1.setText("");
            c=5;
        }
        if(e.getSource()==eql) {
            s2 = tx1.getText();
            if(c==1) {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tx1.setText(String.valueOf(n));
            }
            else
            if(c==2) {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tx1.setText(String.valueOf(n));
            }
            else
            if(c==3) {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tx1.setText(String.valueOf(n));
            }
            if(c==4) {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0) {
						n = Integer.parseInt(s1)/Integer.parseInt(s2);
						tx1.setText(String.valueOf(n));
                    }
                    else
                       tx1.setText("infinite");
 
                }
                catch(Exception i){}
            }
            if(c==5) {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tx1.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==clr) {
            tx1.setText("");
        }
	}
}

class Calci {
	public static void main(String SK [] ) {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(600,600);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
	}
}