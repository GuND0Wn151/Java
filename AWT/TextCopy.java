//copy awt
import java.awt.*;
import java.awt.event.*;

class TextCopy extends Frame implements ActionListener{
		Button b1;
		TextField t1;
		TextField t2;
		TextTest1(){
			b1=new Button();
			t1=new TextField(20);
			t2=new TextField(20);
			setBackground(Color.black);
			setTitle("Awt");
			setSize(500,600);
			setLayout(new FlowLayout()); 
			b1.setLabel("Copy");
			b1.addActionListener(this);
			add(b1);
			add(t1);
			add(t2);
			addWindowListener(new SubClass());
			setVisible(true);
		}
		
		
	public void actionPerformed(ActionEvent ae){
		
			String f=t1.getText();
		t2.setText(f);
			
	}
	public static void main(String args[]){
		new TextCopy();
	}
	class SubClass extends WindowAdapter{
		public void windowClosing(WindowEvent we){System.exit(0);}
	}
	
}
