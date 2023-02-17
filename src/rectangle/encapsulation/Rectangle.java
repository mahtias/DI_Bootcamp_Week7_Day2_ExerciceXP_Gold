/**
 * @author N'ZO LAGOU
 * 
 * Exercice 3 : Rectangle D'encapsulation
Instructions
Dans cet exemple de programme, nous allons 
créer une classe Rectangleet déclarer la variable longueur et largeur comme privée.

Un constructeur sera utilisé pour initialiser 
la valeur des variables.

Lorsqu'un objet est créé, le constructeur sera 
appelé et la valeur par défaut des variables d'instance sera assignée.

Déclarez les variables d'instance comme privées dans la classe.

Déclarez un constructeur Rectangleet définissez les paramètres du constructeur.


Créez une méthode getter pour chaque variable privée.

Créez une méthode setter pour chaque variable
 privée et définissez le paramètre.
 */


package rectangle.encapsulation;

public class Rectangle {
	 private int length;
	    private int breadth;

	    public Rectangle() {
	        this.length = 0;
	        this.breadth = 0;
	    }

		public Rectangle(int length, int breadth) {
			super();
			this.length = length;
			this.breadth = breadth;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getBreadth() {
			return breadth;
		}

		public void setBreadth(int breadth) {
			this.breadth = breadth;
		}

		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
		}
	    

}
