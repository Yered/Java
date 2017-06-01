import java.util.Scanner;
public class MayorDeTres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Introduzca el primer número: ");
		num1 = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		num2 = teclado.nextInt();
		System.out.print("Introduzca el tercer número: ");
		num3 = teclado.nextInt();
		teclado.close();
		if(num1 > num2){
			if(num1>num3){
				System.out.print("El 1 es el mayor");
			}else{
				System.out.print("El 3 es el mayor");
			}
		}else{
			if(num2 > num3){
				System.out.print("El 2 es el mayor");
			}else{
				System.out.print("El 3 es el mayor");
			}
		}
	}

}
