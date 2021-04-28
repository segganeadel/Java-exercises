package exo1;

public class ProgPoint {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		p1.x=5; p1.y=6;
		p2.x=-2; p2.y=-7;
		
		Point m = Point.milieu(p1, p2);
		m.affiche();
		
		m = Point.procheDuCentre(p1, p2);
		m.affiche();
		
		Point p3 = new Point(9.4,7.4);
		p3.affiche();
		
		
		

	}

}
