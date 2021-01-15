//import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;




public class jFramedemo extends JFrame{
      JButton b1,b2,b3;
      Container c;
      jFramedemo(){
            b1= new JButton("RED");
            b2=new JButton("GREEN");
            b3=new JButton("BLUE");
            setSize(500,400);
            setTitle("JFRAME");
            c=getContentPane();
            setLayout(new FlowLayout());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            c.add(b1);c.add(b2);c.add(b3);
            b1.addActionListener(new SubClass());
            b2.addActionListener(new SubClass());
            b3.addActionListener(new SubClass());
            setVisible(true);
      }
      class SubClass implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                  if(ae.getSource()==b1)
                        c.setBackground(Color.RED);
                  else if(ae.getSource()==b2)
                        c.setBackground(Color.GREEN);
                  else if(ae.getSource()==b3)
                        c.setBackground(Color.BLUE);
            }
      }
      public static void main(String args[]){
            new jFramedemo();
      }
}
