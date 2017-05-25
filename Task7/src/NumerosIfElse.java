import java.util.Scanner;

public class NumerosIfElse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.print("Ingrese el primer valor: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		num2 = teclado.nextInt();
		teclado.close();
		if(num1>num2){
			System.out.print(num1+num2);
			System.out.print(num1-num2);
		}else{
			System.out.print(num1*num2);
			System.out.print(num1/num2);
		}
	}

}
