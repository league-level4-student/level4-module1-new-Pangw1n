package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowingPolymorph extends Polymorph {

	public FollowingPolymorph(int x, int y, int width, int height) {
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
    
	public void mouseMoved(int mouseX, int mouseY) {
		// TODO Auto-generated method stub
		System.out.println("debug");
		setX(mouseX);
		setY(mouseY);
	}
}
