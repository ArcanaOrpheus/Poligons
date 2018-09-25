package poligons;

public class Segment {
		
	protected int x0;
	protected int x1;
	protected int y0;
	protected int y1;
	
	//Constructor de segments
	
	Segment(int x0, int y0, int x1, int y1){
		this.x0=x0;
		this.x1=x1;
		this.y0=y0;
		this.y1=y1;
	}
	
	Segment(Segment s){
		x0=s.x0;
		x1=s.x1;
		y0=s.y0;
		y1=s.y1;
	}
	
	public String toString() {
		return x0+" "+y0+" "+x1+" "+y1;
	}
	
}
