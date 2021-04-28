package exo2;
import exo1.Point;

public class Segment {
Point debut;
Point fin;

public Segment() {
	debut = new Point();
	fin = new Point();
}


public Segment(Point a,Point b) {
		debut=a;
		fin=b;
}

public void affiche() {
	System.out.println("Debut");
	debut.affiche();
	System.out.println("Fin");
	fin.affiche();
}	
public double longeur (Segment a) {
	double lng=Point.Distance(a.debut,a.fin);
	return lng;
}
public static Point milieu(Point a,Point b) {
	Point m = new Point();
	m=milieu(a, b);
	return m;
}
public int compareTo(Segment a,Segment b) {
	if (longeur(a)==longeur(b))
			return 0;
	else 
			if (longeur(a)>longeur(b))
					return 1;
			else 
					return -1;
		
}

}
