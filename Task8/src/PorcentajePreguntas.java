import java.util.Scanner;

public class PorcentajePreguntas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int preguntasTotales, preguntasCorrectas, resto, porcentaje;
		System.out.print("Preguntas totales: ");
		preguntasTotales = teclado.nextInt();
		System.out.print("Preguntas correctas: ");
		preguntasCorrectas = teclado.nextInt();
		teclado.close();
		resto =  (preguntasTotales - preguntasCorrectas)*10;
		porcentaje = 100-resto;
		
		if(porcentaje >= 90){
			System.out.println("Nivel máximo >= 90% ("+porcentaje+") ");
		}else if(porcentaje >= 75){
			System.out.println("Nivel medio >= 75% y < 90% ("+porcentaje+") ");
		}else if(porcentaje >= 50){
			System.out.println("Nivel regular >= 50% y < 75% ("+porcentaje+") ");
		}else if(porcentaje < 50){
			System.out.println("Fuera de nivel <50% ("+porcentaje+") ");
		}
	}

}
