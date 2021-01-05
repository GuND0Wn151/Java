import java.awt.*;
import java.awt.event.*;


public class UserNamePass extends Frame implements ActionListener{
      Button b1;
      TextField t1;
      TextField t2;
      Label l1;
      
      UserNamePass(){
            b1=new Button("Validate");
		t1=new TextField(20);
		t2=new TextField(20);
            l1=new Label();
            setLayout(new FlowLayout());
            setSize(400,300);
            setTitle("AWt Authentication");
            b1.addActionListener(this);
            addWindowListener(new SubClass());
            add(b1);
            add(t1);
            add(t2);
            add(l1);
            setVisible(true);
      }
      public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==b1){
                  String x=t1.getText();
                  String y=t2.getText();
                  if(x.equals("admin") && y.equals("password"))
                  l1.setText("Valid");
                  else
                  l1.setText("Invalid User");
            }
      }
      class SubClass extends WindowAdapter{
		public void windowClosing(WindowEvent we){System.exit(0);}
      }
      public static void main(String args[]){
            new UserNamePass();
      }
}
