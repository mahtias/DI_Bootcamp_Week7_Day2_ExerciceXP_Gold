/**
 * @author N'ZO LAGOU
 * Créer une classeNumber

Définissez un champ comme privé dans la classe Number. Ainsi, le champ 
n'est accessible qu'au sein de la classe et personne ne peut y accéder depuis l'extérieur de la classe.

Utilisez les méthodes setter et getter publiques pour définir et lire 
la valeur de la variable ou du champ.

En faisant cela, vous masquez le champ et fournissez son implémentation 
depuis l'extérieur de la classe. Ce mécanisme de programmation est appelé Encapsulation en Java.

Il aide à lier les données (variables) et le code (méthodes) avec eux.

Par exemple, une classe est un bon exemple d'encapsulation car si nous 
écrivons des variables et des méthodes à l'intérieur de la classe, la classe les lie ensemble.
 */

package encapsulation;

public class number {

	private int element;

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}
	

}
