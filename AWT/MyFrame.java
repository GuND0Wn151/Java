
import java.awt.event.*;
import java.awt.*;

class MyFrame extends Frame implements MouseListener , MouseMotionListener, ActionListener{
	MyFrame(){
		setSize(300,400);
		setTitle("Awt");
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new SubClass());
		setVisible(true);
	}
	public void mouseEntered(MouseEvent me){
		System.out.println("Mouse enetered");
	}
	public void mouseExited(MouseEvent me){
		int x=me.getX();
		int y=me.getY();
		System.out.println("asdsa"+x+"dfds"+y);
		System.out.println("Mouse Excited");
	}
	public void mousePressed(MouseEvent me){
		System.out.println("Mouse pressed");
	}
	public void mouseReleased(MouseEvent me){
		System.out.println("Mouse released");
	}
	public void mouseClicked(MouseEvent me){
		System.out.println("Mouse clicked");
	}
	public void mouseDragged(MouseEvent me){
		System.out.println("Mouse Dragged");
	}
	public void mouseMoved(MouseEvent me){
		System.out.println("Mouse Moved");
	}
	class SubClass extends WindowAdapter{
		public void windowClosing(WindowEvent we){System.exit(0);}
	}
	public static void main(String argsp[]){
		new MyFrame();
	}
}

