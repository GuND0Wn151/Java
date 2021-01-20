import java.util.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.applet.*;
/*
<applet code="FirstApplet" width=500 height=500></applet>
*/
public class FirstApplet extends Applet{
      Button b1,b2;
      TextField t1;
      public void init(){
            b1 = new Button();
            b2 = new Button();
            t1 = new TextField();
            
            add(b1);add(b2);add(t1);
            b1.addActionListener(new SubClass());
            b1.addActionListener(new SubClass());
            setVisible(true);

      }
      class SubClass implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                  if(ae.getSource()==b1)
                        t1.setText("Why You Dint Click Button 2");
                  else if(ae.getSource()==b2)
                        t1.setText("Why You Dint Click Button 1");
            }

      }
}
