package programa;

import java.util.Scanner;

public class ProgramaBhaskara {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double a,b,c,dt,x1,x2;
		
		System.out.print("Informe o valor de A:");
		a = tec.nextInt();
		System.out.print("Informe o valor de B:");
		b = tec.nextInt();
		System.out.print("Informe o valor de C:");
		c = tec.nextInt();
		
		dt = Math.pow(b,2)-4*a*c;
		
		if(dt <= 0) {
			System.out.println("O valor de Delta é invalido");
		}else {
		
		x1 = (-b + (Math.sqrt(dt)))/2*a;
		x2 = (-b - (Math.sqrt(dt)))/2*a;
		
		System.out.println("O valor de x1 é:" + x1);
		System.out.println("O valor de x2 é:" + x2);
		}	
	}
}
