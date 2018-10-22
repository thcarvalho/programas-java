package programa;

import java.util.Scanner;

public class ProgramaVoto {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Qual seu ano de nascimento? ");
		int a = tec.nextInt();
		System.out.print("Qual o ano atual? ");
		int b = tec.nextInt();
		
		int x = b - a;
		
		if(x < 16) {
			System.out.println("Você não pode votar!");
		} else if((x >= 16 && x < 18) || (x > 70)) {
			System.out.println("Voto Opcional");
		}else {
			System.out.println("Voto Obrigatório!");
		}
		
	}
}
