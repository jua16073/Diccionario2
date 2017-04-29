import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
public class Principal {
	static Tri<String, String> arbol;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		Factory factory= new Factory();
		System.out.println("Que arbol desea implementar: 1. Splay Tree: 2. Two Three Tree");
		int dec= teclado.nextInt();
		teclado.nextLine();
		arbol= factory.implementacion(dec);
		Principal x= new Principal();
		x.lectura();
		System.out.println("Ingrese el texto a traducir");
		String text= teclado.nextLine();
		System.out.println(x.trad(text));
		
		
	}
	
	public void llenar(String pal){
		pal= pal.toLowerCase();
		pal = pal.replaceAll("\t", " ");
		String [] palabras= pal.split(" ");
		arbol.put(palabras[0], palabras[1]);
	}
	
	String lectura() throws IOException{
		String a = ""; 
		JFileChooser archivo = new JFileChooser();
		archivo.showOpenDialog(null);
		BufferedReader reader = new BufferedReader(new FileReader(archivo.getSelectedFile().getPath()));
		String pal;
		while(reader.ready()){
			while ((pal=reader.readLine())!= null){
				a=a+" "+pal;
				llenar(pal);
			}
			return a;
		}
		return a;
	}
	
	public String trad(String pal){
		String trads="";
		pal = pal.toLowerCase();
		String [] palabras= pal.split(" ");
		for (int i=0; i< palabras.length; i++ ){
			if (arbol.get(palabras[i])!=null){
				trads= trads+ arbol.get(palabras[i]) + " ";
			}
			else
				trads= trads+ palabras[i]+ " ";
		}
		return trads;
	}
	

}
