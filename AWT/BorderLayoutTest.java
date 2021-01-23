
import java.awt.event.*;
import java.util.*;
import java.awt.*;


public class BorderLayoutTest extends Frame{
      Button b1,b2,b3,b4;
      TextField t1;
      BorderLayoutTest(){
            b1=new Button("North");
            b2=new Button("South");
            b3=new Button("East");
            b4=new Button("West");
            t1=new TextField();
            setSize(400,300);
            setLayout(new BorderLayout());
            setTitle("awt Border");
            add(b1);add(b2);add(b3);add(b4);add(t1);
            b1.addActionListener(new SubClass());
            b2.addActionListener(new SubClass());
            b3.addActionListener(new SubClass());
            b4.addActionListener(new SubClass());
            addWindowListener(new SubClass1());
            setVisible(true);
      }
      class SubClass1 extends WindowAdapter{
            public void windowClosing(WindowEvent we){
                  System.exit(0);
            }
      }
      class SubClass implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                  if(ae.getSource()==b1)
                        t1.setText("North");
                  else if(ae.getSource()==b2)
                        t1.setText("South");
                  else if(ae.getSource()==b3)
                        t1.setText("East");
                  else if(ae.getSource()==b4)
                        t1.setText("West");
                  
            }
      }

      public static void main(String args[]){
            new BorderLayoutTest();
      }
}
