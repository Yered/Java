import java.util.Scanner;
public class NumeroDosDigitos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1;
		System.out.print("Introduzca el número");
		num1 = teclado.nextInt();
		teclado.close();
		if(num1<10){
			System.out.print("Tiene un dígito");
		}else{
			System.out.print("Tiene dos dígitos");
		}
	}

}
