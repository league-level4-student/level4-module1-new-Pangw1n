package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class ClickablePolymorph extends Polymorph {
	public ClickablePolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

    @Override
    public void update() {
		
    }
    
    public void onClick()
    {
    	System.out.println("Polymorph Clicked");
    }
}
