/*Autores: Rodrigo Juárez (16073) y Andrea Cordón (16076)
 *Fecha 28/04/2017:
 *Descripción: Pruebas unitarias para los métodos de ingresar un nuevo nodo al árbol y
 *para obtener el valor de un nodo.
 *JUnit.java*/

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit {

	@Test
	public void pruebaSplay(){
		SplayBST<String, String> splay = new SplayBST<String, String>();
		splay.put("Food", "comida");
		splay.put("Sleep", "dormir");
		splay.put("happiness", "alegria");
		assertEquals("Sleep", splay.get("dormir"));
	}

	@Test
	public void pruebaDosTres(){
		TwoThreeTree<String, String>  two = new TwoThreeTree<String, String>();
		two.put("house", "casa");
		two.put("Small", "pequeño");
		two.put("American", "americano");
		assertEquals("house", two.get("casa"));
	}

}
