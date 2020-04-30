package Bri;

public abstract class Pen {
	protected Color color;
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color=color;
	}

	public abstract void draw(String name);

}
