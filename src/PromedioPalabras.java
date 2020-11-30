
import java.util.Scanner;
import java.util.StringTokenizer;

public class PromedioPalabras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto = teclado.nextLine();
		
		StringTokenizer total = new StringTokenizer(texto);
		int numeoPalabra =total.countTokens();
		int []palabras;
		palabras=new int[numeoPalabra];
		int n =-1;
		for(int i =0;i<texto.length();i++) {
			n++;
			if(texto.charAt(i)==' ') {
				numeoPalabra =numeoPalabra-1;
				palabras[numeoPalabra]= n;
				n=-1;
			}
			if(i == texto.length()-1){
				numeoPalabra =numeoPalabra-1;
			    n++;
				palabras[numeoPalabra]= n;
				n=-1;
			}
		}
		double promedio =0;
		for(int i =0;i<palabras.length;i++) {
			
			promedio = promedio + palabras[i];
		}
		int resultado = (int)(Math.ceil(promedio/palabras.length));
		System.out.println(resultado);
	}

}