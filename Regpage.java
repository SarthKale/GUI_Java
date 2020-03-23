import java.awt.*;
import java.awt.event.*;
import java.io.*;

class FDemo extends Frame implements ActionListener {
	
	Button b;  TextArea ta;  Checkbox lc, lcp, lj, lp, lh;
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox ml, fl;  Choice date, mon, yr;
	TextField txf, txl, txa, txc, txe; 
	Label fn, ln, em, con, ad, dt, gd, lng;
	
	FDemo() throws IOException {
		Font f = new Font("Arial", Font.BOLD, 30);
		setFont(f);
		setLayout(null);
		setBackground(Color.blue);
		setTitle("Student Data");
		
		fn = new Label("First Name");
		fn.setSize(200,30);
		fn.setLocation(50,55);
		ln = new Label("Last Name");
		ln.setSize(200,30);
		ln.setLocation(50,110);
		em = new Label("Email");
		em.setSize(200,30);
		em.setLocation(50,160);
		con = new Label("Contact No.");
		con.setSize(200,30);
		con.setLocation(50,210);
		ad = new Label("Address");
		ad.setSize(200,30);
		ad.setLocation(50,260);
		dt = new Label("DOB");
		dt.setSize(200,30);
		dt.setLocation(50,310);
		gd = new Label("Gender");
		gd.setSize(200,30);
		gd.setLocation(50,380);
		lng = new Label("Language");
		lng.setSize(200,30);
		lng.setLocation(50,430);
		
		add(fn);
		add(ln);
		add(em);
		add(con);
		add(ad);
		add(dt);
		add(gd);
		add(lng);
		
		txf = new TextField(20);
		txf.setSize(200,30);
		txf.setLocation(250,55);
		txl = new TextField(20);
		txl.setSize(200,30);
		txl.setLocation(250,110);
		txe = new TextField(20);
		txe.setSize(200,30);
		txe.setLocation(250,160);
		txc = new TextField(20);
		txc.setSize(200,30);
		txc.setLocation(250,210);
		txa = new TextField(20);
		txa.setSize(200,30);
		txa.setLocation(250,260);
		
		add(txf);
		add(txl);
		add(txe);
		add(txc);
		add(txa);
		
		date = new Choice();
		date.setSize(60,30);
		date.setLocation(250,310);
		for(int i=1; i<=31; i++) {
		date.add("" +i);
		}
		add(date);
		
		mon = new Choice();
		mon.setSize(100,30);
		mon.setLocation(320,310);
		mon.add("JAN");
		mon.add("FEB");
		mon.add("MARCH");
		mon.add("APRIL");
		mon.add("MAY");
		mon.add("JUN");
		mon.add("JULY");
		mon.add("AUG");
		mon.add("SEP");
		mon.add("OCT");
		mon.add("NOV");
		mon.add("DEC");
		add(mon);
		
		yr = new Choice();
		yr.setSize(100,30);
		yr.setLocation(430,310);
		for(int i=1991; i<=2001; i++) {
		yr.add("" +i);
		}
		add(yr);
		
		ml = new Checkbox("Male", true, cbg);
		ml.setSize(100,30);
		ml.setLocation(250,380);
		add(ml);
		fl = new Checkbox("Female", false, cbg);
		fl.setSize(100,30);
		fl.setLocation(400,380);
		add(fl);

		lc = new Checkbox("C");
		lc.setSize(80,30);
		lc.setLocation(250,430);
		add(lc);
		lcp = new Checkbox("C++");
		lcp.setSize(80,30);
		lcp.setLocation(350,430);
		add(lcp);
		lj = new Checkbox("Java");
		lj.setSize(90,30);
		lj.setLocation(455,430);
		add(lj);
		lp = new Checkbox("Python");
		lp.setSize(120,30);
		lp.setLocation(250,480);
		add(lp);
		lh = new Checkbox("HTML");
		lh.setSize(80,30);
		lh.setLocation(390,480);
		add(lh);
		
		ta = new TextArea();
		ta.setSize(450, 450);
		ta.setLocation(600,100);
		add(ta);
		
		b = new Button("Click");
		b.setSize(100,30);
		b.setLocation(350,540);
		add(b);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) throws IOException {
		String s1 = txf.getText();
		ta.setText(s1);
		s1 = s1 + " ";
		s1 = s1 + txl.getText();
		ta.setText(s1);
		s1 = s1 + "\n";
		s1 = s1 + txe.getText();
		ta.setText(s1);
		s1 = s1 + "\n";
		s1 = s1 + txc.getText();
		ta.setText(s1);
		s1 = s1 + "\n";
		s1 = s1 + txa.getText();
		ta.setText(s1);
		
		s1 = s1 + "\n";
		s1 = s1 + date.getSelectedItem();
		ta.setText(s1);
		s1 = s1 + "-";
		s1 = s1 + mon.getSelectedItem();
		ta.setText(s1);
		s1 = s1 + "-";
		s1 = s1 + yr.getSelectedItem();
		ta.setText(s1);
		
		s1 = s1 + "\n";
		s1 = s1 + cbg.getSelectedCheckbox().getLabel();
		s1 = s1 + "\n";
		ta.setText(s1);
		
		if(lc.getState()) {
		s1 = s1 + lc.getLabel();
		ta.setText(s1);
		}
		
		if(lcp.getState()) {
		s1 = s1 + " ";
		s1 = s1 + lcp.getLabel();
		ta.setText(s1);
		}
		
		if(lj.getState()) {
		s1 = s1 + " ";
		s1 = s1 + lj.getLabel();
		ta.setText(s1);
		}
		
		if(lp.getState()) {
		s1 = s1 + " ";
		s1 = s1 + lp.getLabel();
		ta.setText(s1);
		}
		
		if(lh.getState()) {
		s1 = s1 + " ";
		s1 = s1 + lh.getLabel();
		ta.setText(s1);
		}
		
		FileOutputStream fo = new FileOutputStream("A.txt", true);
		for(int i=0; i<s1.length(); i++)
			fo.write(s1.charAt(i));
		fo.close();
	}
}

class Regpage {
	public static void main(String SK [] ) throws IOException {
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(1000,600);
		f.setLocation(100,100);
		f.setBackground(Color.blue);
	}
}