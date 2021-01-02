//awt
import java.awt.*;
import java.awt.event.*;


class FirstAWt{
	public static void main(String args[]){
		Frame win = new Frame();
		win.setSize(920,920);
		win.setVisible(true);
		win.addWindowListener(new Test1());
		
	}
	
}

class Test1 implements WindowListener{
	public void windowClosing(WindowEvent we){
		System.exit(0);
	}
	public void windowClosed(WindowEvent we){
		System.out.println("The End");
	}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	
}
