import java.util.Scanner;
public class PositivoNuloNegativo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Introduzca el número: ");
		num = teclado.nextInt();
		teclado.close();
		if(num >= 0){
			if(num == 0){
				System.out.print("El número es 0");
			}else{
			System.out.print("El número es positivo");
			}
		}else{
			System.out.print("El número es negativo");
		}
		
	}
}
