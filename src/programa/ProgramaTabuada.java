package programa;

import java.util.Scanner;

public class ProgramaTabuada {
	public static void main(String[]args) {
		Scanner tec = new Scanner(System.in);
		int a,b,c ;
		c = 0;
		
		System.out.print("Digite um n�mero: ");
		a = tec.nextInt();
		System.out.println("A tabuada deste n�mero �:");
		
		for(b = 0; b <= (a * 10); b+=a) {
			System.out.println(a + "x" + c++ + "=" + b);
		}
	}
}
