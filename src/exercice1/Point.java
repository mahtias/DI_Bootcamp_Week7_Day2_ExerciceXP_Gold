/**
 * @author N'ZO LAGOU
 * Comme exemple de réutilisation d'une classe via la composition,
 supposons que nous ayons une classe existante appelée Point, définie comme indiqué dans le diagramme de classes ci-dessus. Le code source est ICI.
Supposons que nous ayons besoin d'une nouvelle classe appelée Line,
 nous pouvons concevoir la classe Line en réutilisant la classe Point via la composition. On dit : « Une droite est composée de deux points », ou « Une droite a deux points ». La composition
 présente une relation "a-un"
 */


package exercice1;

public class Point {
	   private int x;
	    private int y;
// constructeur sans paramettre
	    public Point() {
	    }
	 // constructeur avec paramettre

	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
//getter setter
	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    // 
	    @Override
	    public String toString() {
	        return "(" + y + ", " + y + ")";
	    }

	    public int[] getXY() {
	        return new int[]{x, y};
	    }

	    public void setXY(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
//calcul 
	    public double distance(int x, int y) {
	        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	    }

	    public double distance(Point anotherPoint) {
	        return Math.sqrt(Math.pow((anotherPoint.x - x), 2) + Math.pow((anotherPoint.y - y), 2));
	    }

	    public double distance() {
	        return Math.sqrt(Math.pow((-x), 2) + Math.pow((-y), 2));
	    }
}
