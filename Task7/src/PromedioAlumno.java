import java.util.Scanner;
public class PromedioAlumno {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota1,nota2,nota3,promedio;
		System.out.print("Ingrese la primera nota");
		nota1 = teclado.nextInt();
		System.out.print("Ingrese la segunda nota");
		nota2 = teclado.nextInt();
		System.out.print("Ingrese la tercera nota");
		nota3 = teclado.nextInt();
		teclado.close();
		promedio = (nota1+nota2+nota3)/3;
		System.out.print(promedio);
		if(promedio >= 7){
			System.out.print("El almuno promociona");
		}else{
			System.out.print("El alumno NO promociona");
		}
	}
}