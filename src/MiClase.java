import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("hola mundo");
		Scanner scanner = new Scanner (System.in);
		int a;
		int b;
		
		System.out.println("Ingrese a: ");
		a=scanner.nextInt();
		System.out.println("Ingrese b: ");
		b=scanner.nextInt();
		
		int suma = a+b;
		
		System.out.println("a + b = "+suma);
		
	}

}
