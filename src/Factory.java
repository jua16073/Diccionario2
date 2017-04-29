/*Autores: Rodrigo Juárez (16073) y Andrea Cordón (16076)
 *Fecha 28/04/2017:
 *Descripción: Factory para decidir que tipo de árbol se creará dependiendo
 *de la seleccion del usuario. 
 *Principal.java*/

public class Factory {

	public Tri implementacion(int n){
		if (n == 1){
			return new SplayBST();
		}
		else if (n == 2){
			return new TwoThreeTree();
		}
		else
		return null;

	}

}
