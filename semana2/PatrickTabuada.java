
import java.util.Scanner;
public class PatrickTabuada {

	
	public static void main(String[] args) {
		/* Patrick Delfim Borges	
		 *  0050016717          */
	
		int numero;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com um numero: ");
		numero = input.nextInt();
		
		System.out.printf("tabuada de somar do %d \n",numero);
		
		for(int i=0;i<=10;i++) {
			System.out.printf("%d + %d: %d \n",numero,i,numero+i);
		}
	}
}
