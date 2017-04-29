/*Autores: Rodrigo Juárez (16073) y Andrea Cordón (16076)
 *Fecha 28/04/2017:
 *Descripción: Contrato para las implementaciones de árboles (Splay Tree y 2-3 Tree).
 *Tri.java*/

public interface Tri<K extends Comparable<K>, V>{

	public boolean contains(K key);
	public V get (K key);
	public void put(K key, V value);

}
