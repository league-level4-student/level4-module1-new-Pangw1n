package _05_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

/*
 * 1. Create new member variables for the width and height of Polymorph then 
 * initialize them in its constructor.
 * 
 * 2. Encapsulate the member variables of the Polymorph class. 
 * 
 * 3. Substitute the hard-coded numbers in the draw method of the BluePolymorph 
 * class with its width and height.
 * 
 * 4. Create a new sub-class of the Polymorph class called RedPolymorph.
 * 
 * 5. Make RedPolymorph draw a red rectangle when its draw method is called.
 * 
 * 6. Create an object of RedPolymorph in the PolymorphWindow class and test
 * it by drawing it like the BluePolymorph.
 * 
 * 7. Create a new sub-class of the Polymorph class called MovingMorph.
 * 
 * 8. Add code to its update method to make MovingMorph objects move around
 * the screen.
 * 
 * 9. Create a MovingMorph object in your PolymorphWindow class and test it
 * by calling its draw and update methods.
 * 
 * 10. Now, delete all references to Polymorphs subclasses inside your
 * PolymorphWindow class.
 * 
 * 11. Create an ArrayList of Polymorph inside your PolymorphWindow class.
 * 
 * 12. Initialize the ArrayList and add a bunch of different types of
 * Polymorph subclass objects to the ArrayList.
 * 
 * 13. Use loops to call the draw and update method for all the Polymorphs in 
 * the list.
 * 
 * 14. Create a Polymorph that follows your mouse. Hint: The MouseMotionListener
 *  interface.
 * 
 * 15. Create a Polymorph that displays a JOptionPane Message Dialog when
 *  clicked. Hint: MouseListener interface.
 */

public class PolymorphWindow extends JPanel implements ActionListener, MouseInputListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    
    public static int MOUSE_X = 0;
    public static int MOUSE_Y = 0;

    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

    public static void main(String[] args) {
        new PolymorphWindow();
    }
    
    public PolymorphWindow()
    {
        window = new JFrame("IT'S MORPHIN' TIME!");
        window.add(this);
        window.getContentPane().setPreferredSize(new Dimension(600, 500));
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseMotionListener(this);
        addMouseListener(this);
        window.pack();

        polymorphs.add(new BluePolymorph(50, 50, 50, 50));
        polymorphs.add(new RedPolymorph(150, 100, 50, 50));
        polymorphs.add(new MovingPolymorph(50, 200, 50, 50));
        polymorphs.add(new FollowingPolymorph(0, 0, 10, 10));
        polymorphs.add(new ClickablePolymorph(50, 400, 500, 50));

        timer = new Timer(1000 / 30, this);
        timer.start();
        window.setVisible(true);
    }
    
    public void paintComponent(Graphics g) {
        // draw background
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, 600, 500);

        try {
        // draw polymorph
        for(Polymorph p : polymorphs)
        {
        	p.draw(g);
        }
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        for(Polymorph p : polymorphs)
        {
        	p.update();
        }
    }

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		for (Polymorph p : polymorphs)
		{
			if (p instanceof ClickablePolymorph)
			{
				if (MOUSE_X >= p.getX() && MOUSE_X <= p.getX() + p.getWidth() && MOUSE_Y >- p.getY() && MOUSE_Y <= p.getY() + p.getHeight())
				{
					((ClickablePolymorph)p).onClick();
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		MOUSE_X = e.getX();
		MOUSE_Y = e.getY();
	}
}
