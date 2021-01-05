
import java.awt.event.*;
import java.awt.*;

class MyKeyEvents extends Frame implements KeyListener{
	MyKeyEvents(){
		setSize(300,400);
		setTitle("Awt");
		//addMouseListener(this);
		addKeyListener(this);
		//addWindowListener(new SubClass());
		setVisible(true);
	}
	public void keyPressed(KeyEvent ke){
    	System.out.println("KeyPressed");
  }
 	 public void keyTyped(KeyEvent ke){
    	System.out.println("KeyTyped");
  }
  	public void keyReleased(KeyEvent ke){
    	System.out.println("KeyReleased");
  }
  	public static void main(String ar[]){
   		new MyKeyEvents();
  }
}
