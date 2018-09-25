package poligons;

import java.util.Scanner;

public class poligon {
	
	Scanner sc= new Scanner(System.in);
	protected int max_segments;
	protected Segment[] segments;
	int max_X=0;
	int max_Y=0;
	
	
	public void addPolygon(int n){
		//Registro el nombre de segments
		max_segments=n;
		segments = new Segment[n];
		addSegments(n);
	}
	
	void addSegments(int numero){
		
		//Afegeixo el nombre de segments del poligon, a cada volta del bucle miro quina es la maxima X y la max Y
		
		for(int i=0; i<numero;i++) {
			System.out.println("Segment "+i);
			int x0 =sc.nextInt();
			if (x0>max_X) {
				max_X=x0;
			}
			int y0 =sc.nextInt();
			if (y0>max_Y) {
				max_Y=y0;
			}
			int x1 =sc.nextInt();
			if (x1>max_X) {
				max_X=x1;
			}
			int y1 =sc.nextInt();
			if (y1>max_Y) {
				max_Y=y1;
			}
			Segment seg= new Segment(x0,y0,x1,y1);
			segments[i]=seg;
			
		}
		
		constructPolygon();
	}

	
	void constructPolygon() {
		
		//Dibuixo el poligon, es molt cutre pero funciona
		
		char tablero[][] = new char[max_X+1][max_Y+1];
		int x0;
		int y0;
		int x1;
		int y1;
		for(int i=0;i<max_segments;i++) {
			
			x0=segments[i].x0;
			y0=segments[i].y0;
			tablero[x0][y0]='*';
			
			x1=segments[i].x1;
			y1=segments[i].y1;
			
			while(x0!=x1 || y0!=y1){
				
				if(x0>x1) {
					x0--;
				}
				
				if(x0<x1) {
					x0++;
				}
				
				if(y0>y1) {
					y0--;
				}
				
				if(y0<y1) {
					y0++;
				}
				
				tablero[x0][y0]='*';
			}
			
			
		}
		
		drawTablero(tablero);
		
	}
	
	
	void drawTablero(char t[][]) {
		
		//Mostro el poligon
		
		for(int i=0;i<max_X+1;i++) {
			for(int j=0;j<max_Y+1;j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
