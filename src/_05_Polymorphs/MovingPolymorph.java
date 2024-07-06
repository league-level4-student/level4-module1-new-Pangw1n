package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolymorph extends Polymorph{
	
	int xVel;
	int yVel;
	
	public MovingPolymorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		Random rand = new Random();
		int mult = (int) Math.pow(-1, rand.nextInt(2));
		this.xVel = mult * 5;
		mult = (int) Math.pow(-1, rand.nextInt(2));
		this.yVel = mult * 5;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

    @Override
    public void update() {
        setX(getX() + xVel);
        setY(getY() + yVel);
        if (getX() <= 0 || getX() >= PolymorphWindow.WIDTH - getWidth())
        {
        	xVel *= -1;
        }
        if (getY() <= 0 || getY() >= PolymorphWindow.HEIGHT - getHeight())
        {
        	yVel *= -1;
        }
    }
	
}
