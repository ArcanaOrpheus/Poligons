package poligons;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		poligon p = new poligon();
		//Forma de fer i dibuixar poligons en fase beta (No comprova els punts ni existeix una clase punt que els determini).
		System.out.println("Nombre de segments: ");
		int n= sc.nextInt();
		p.addPolygon(n);
		
	}

}
