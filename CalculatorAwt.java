import java.awt.*;
import java.awt.event.*;
public class CalculatorAwt implements ActionListener
{
    int c,n;
    String s1,s2,s3,s4,s5;
    Frame f;
    Button zero,b7,b8,b9,b4,b5,b6,b1,b2,b3,sum,dif,pro,que,prc,eql,clr;
    Panel p;
    TextField tf;
    GridLayout g;
    CalculatorAwt()
    {
        f = new Frame("My calculator");
        p = new Panel();
        f.setLayout(new FlowLayout());
        zero = new Button("0"); //zero
        zero.addActionListener(this);
        b7 = new Button("1"); //b6
        b7.addActionListener(this);
        b8 = new Button("2"); //b1
        b8.addActionListener(this);
        b9 = new Button("3"); //b2
        b9.addActionListener(this);
        b4 = new Button("4"); //b9
        b4.addActionListener(this);
        b5 = new Button("5"); //b4
        b5.addActionListener(this);
        b6 = new Button("6"); //b5
        b6.addActionListener(this);
        b1 = new Button("7"); //zero
        b1.addActionListener(this);
        b2 = new Button("8"); //b7
        b2.addActionListener(this);
        b3 = new Button("9"); //b8
        b3.addActionListener(this);
        sum = new Button("+"); //sum
        sum.addActionListener(this);
        dif = new Button("-"); //dif
        dif.addActionListener(this);
        pro = new Button("*"); //pro
        pro.addActionListener(this);
        que = new Button("/"); //que
        que.addActionListener(this);
        prc = new Button("%"); //prc
        prc.addActionListener(this);
        eql = new Button("="); //eql
        eql.addActionListener(this);
        clr = new Button("C"); //clr
        clr.addActionListener(this);
        tf = new TextField(20);
        f.add(tf);
        g = new GridLayout(4,4,10,20);
        p.setLayout(g);
        p.add(zero);p.add(b7);p.add(b8);p.add(b9);p.add(b4);p.add(b5);p.add(b6);p.add(b1);p.add(b2);
        p.add(b3);p.add(sum);p.add(dif);p.add(pro);p.add(que);p.add(prc);p.add(eql);p.add(clr);
        f.add(p);
        f.setSize(600,600);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==zero)
        {
            s3 = tf.getText();
            s4 = "0";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b7)
        {
            s3 = tf.getText();
            s4 = "1";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b8)
        {
            s3 = tf.getText();
            s4 = "2";
            s5 = s3+s4;
            tf.setText(s5);
        }if(e.getSource()==b9)
        {
            s3 = tf.getText();
            s4 = "3";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b4)
        {
            s3 = tf.getText();
            s4 = "4";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b5)
        {
            s3 = tf.getText();
            s4 = "5";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b6)
        {
            s3 = tf.getText();
            s4 = "6";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b1)
        {
            s3 = tf.getText();
            s4 = "7";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b2)
        {
            s3 = tf.getText();
            s4 = "8";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==b3)
        {
            s3 = tf.getText();
            s4 = "9";
            s5 = s3+s4;
            tf.setText(s5);
        }
        if(e.getSource()==sum)
        {
            s1 = tf.getText();
            tf.setText("");
            c=1;
 
        }
        if(e.getSource()==dif)
        {
            s1 = tf.getText();
            tf.setText("");
            c=2;
 
        }
        if(e.getSource()==pro)
        {
            s1 = tf.getText();
            tf.setText("");
            c=3;
 
        }
        if(e.getSource()==que)
        {
            s1 = tf.getText();
            tf.setText("");
            c=4;
 
        }
        if(e.getSource()==prc)
        {
            s1 = tf.getText();
            tf.setText("");
            c=5;
 
        }
        if(e.getSource()==eql)
        {
            s2 = tf.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1)+Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==2)
            {
                n = Integer.parseInt(s1)-Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            else
            if(c==3)
            {
                n = Integer.parseInt(s1)*Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
            if(c==4)
            {
                try
                {
                    int p=Integer.parseInt(s2);
                    if(p!=0)
                    {
                                        n = Integer.parseInt(s1)/Integer.parseInt(s2);
                    tf.setText(String.valueOf(n));
                     }
                     else
                        tf.setText("infinite");
 
                }
                catch(Exception i){}
            }
            if(c==5)
            {
                n = Integer.parseInt(s1)%Integer.parseInt(s2);
                tf.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==clr)
        {
            tf.setText("");
        }
    }
 
    public static void main(String[] abc)
    {
        CalculatorAwt v = new CalculatorAwt();
    }
}