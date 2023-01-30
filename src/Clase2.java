import java.util.Scanner;

public class Clase2 {
	static Scanner entrada;
	Scanner figura;
	
	public static void main(String[] args) {
		Scanner lado = new Scanner(System.in);
		System.out.println("Dame el lado con el que quieres trabajar");
		String ID = lado.nextLine();
		
		int i=Integer.parseInt(ID);
		
		Clase1 cir = new	

		Clase1(i);
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("¿Que figura quieres hacer?");
	System.out.println("1. Cuadrado.");
	System.out.println("2. Circulo.");
	System.out.println("3. Salir.");
	int f=Integer.parseInt(entrada.nextLine());
	
	switch(f) {
	case 1:
		Scanner formula = new Scanner(System.in);
		System.out.println("¿Quieres obtener ");
		System.out.println("1. Perimetro.");
		System.out.println("2. Área.");
		int t=Integer.parseInt(formula.nextLine());

		switch(t) {
		case 1:
			System.out.println("El perimetro es: "+cir.cPCi());
		break;
		
		case 2:
		System.out.println("El area es: "+cir.cACi());
		break;
		}
		
	break;
	
		case 2:
		Scanner formu = new Scanner(System.in);
		System.out.println("¿Quieres obtener ");
		System.out.println("1. Perimetro.");
		System.out.println("2. Área.");
		int h=Integer.parseInt(formu.nextLine());
		switch(h) {
			case 1:
				System.out.println("El perimetro es: "+cir.cPCu());
			break;
		
			case 2:
				System.out.println("El area es: "+cir.cACu());
			break;
		}
		break;
		case 3:
			System.out.println("Adios...");
			System.exit(0);
			break;
	}
	}
}