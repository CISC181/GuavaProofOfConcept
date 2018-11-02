package CISC181.Guava.EvictingQueue;

public class Rectangle implements Comparable {

	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int iLength) {
		this.iLength = iLength;
	};
	public double area()
	{
		return (double)this.iLength * this.iWidth;
	}
	@Override
	public int compareTo(Object arg0) {
		Rectangle r = (Rectangle)arg0;		
		return (int) (this.area() - r.area()  );
	}
}
