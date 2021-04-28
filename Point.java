package exo1;
//import java.lang.Math;

public class Point {
double x,y;

public Point (){x=0.0; y=0.0;};
public Point (double x,double y){ this.x=x ; this.y=y;};


public double getX() {return x;};
public double getY() {return y;};
public void setX(double a) {x=a;};
public void setY(double a) {y=a;};
public void affiche() {System.out.println("les coordonnes du point sont : X=" + x +" Y= " + y);};
public static Point milieu(Point a,Point b) {
	Point m = new Point();
	m.x=a.x+b.x; 
	m.x=a.y+b.y;
	return m;
}

public static Point symetrie(Point a) {
	Point s = new Point();	
	s.x=-a.x;
	s.y=-a.y;
	return s;
}
public boolean egal(Point a,Point b) {
	  if(a.x==b.x && a.y==b.y)
          return true;
     else
          return false;
}
public static double Distance(Point a,Point b) {
    double d=(b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y);
    d=Math.sqrt(d);
    return d;
}

public static Point procheDuCentre (Point a,Point b) {
	Point s = new Point();
    double d1=Distance(a,s);
    double d2=Distance(b,s);

    if(d1<=d2)
         s=a;
    else 
         s=b;
	
	return s;
}
}
