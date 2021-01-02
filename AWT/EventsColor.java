//color
import java.util.*;
import java.awt.*;
import java.awt.event.*;

//getactionacoomand.equal(red) red is buuton name
class EventsColor extends Frame implements ActionListener {
	Button b1;
	Button b2;
	EventsColor(){
		b1=new Button();
		b2=new Button();
		setBackground(Color.black);
		setTitle("Awt");
		setSize(500,600);
		setLayout(new FlowLayout());
		b1.setLabel("CLick");
		b1.setBackground(Color.green);
		b2.setBackground(Color.red);
		b2.setLabel("Dont CLick");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
		addWindowListener(new SubClass());
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1)
			setBackground(Color.green);
		else if(ae.getSource()==b2)
			setBackground(Color.red);
	}
	public static void main(String args[]){
		new EventsColor();
	}
	class SubClass extends WindowAdapter{
		public void windowClosing(WindowEvent we){System.exit(0);}
	}
	
	
}
