
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Calculator extends Frame implements ActionListener{
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	TextField t1;
	TextField t2;
	TextField t3;
	Calculator(){
			b1=new Button("Add");
			b2=new Button("Sub");
			b3=new Button("MUlt");
			b4=new Button("Div");
			t1=new TextField(20);
			t2=new TextField(20);
			t3=new TextField(20);
			setLayout(new GridLayout(3,2));
			setTitle("Awt");
			setSize(500,600);
			//setLayout(new FlowLayout()); 
			add(t1);
			add(t2);
			add(t3);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			addWindowListener(new SubClass());
			setVisible(true);
		}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			int a =Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(a+b));
			
		}
		else if(ae.getSource()==b2){
			int a =Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(a-b));
			
		}
		else if(ae.getSource()==b3){
			int a =Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(a*b));
			
		}	
		else if(ae.getSource()==b4){
			int a =Integer.parseInt(t1.getText());
			int b =Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(a/b));
			
		}		
			
	}
	class SubClass extends WindowAdapter{
		public void windowClosing(WindowEvent we){System.exit(0);}
	}
	public static void main(String args[]){
		new Calculator();
	}
	
	
}
