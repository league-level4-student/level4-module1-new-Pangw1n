package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowingPolymorph extends Polymorph{

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
		setX(PolymorphWindow.MOUSE_X);
		setY(PolymorphWindow.MOUSE_Y);
    }
}
