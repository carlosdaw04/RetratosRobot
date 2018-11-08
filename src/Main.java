import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int opcionPelo;
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////");
			System.out.println("3 - |\"\"\"\"\"\"\"|");
			System.out.println("4 - |||||||||");
			System.out.println("Introduce el número de la opción elegida para el pelo (1-4):");
			opcionPelo = in.nextInt();
			if (opcionPelo < 1 || opcionPelo > 4)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (opcionPelo < 1 || opcionPelo > 4);
		
		int opcionOjos;
		do {
			System.out.println("1 - |  O O  |");
			System.out.println("2 - |-(· ·)-|");
			System.out.println("3 - |-(o o)-|");
			System.out.println("4 - |  \\ /  |");
			System.out.println("Introduce el número de la opción elegida para los ojos (1-4):");
			opcionOjos = in.nextInt();
			if (opcionOjos < 1 || opcionOjos > 4)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (opcionOjos < 1 || opcionOjos > 4);
		
		int opcionNariz;
		do {
			System.out.println("1 - @   J   @");
			System.out.println("2 - {   \"   }");
			System.out.println("3 - [   j   ]");
			System.out.println("4 - <   -   >");
			System.out.println("Introduce el número de la opción elegida para la nariz (1-4):");
			opcionNariz = in.nextInt();
			if (opcionNariz < 1 || opcionNariz > 4)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (opcionNariz < 1 || opcionNariz > 4);
		
		int opcionBoca;
		do {
			System.out.println("1 - |  ===  |");
			System.out.println("2 - |   -   |");
			System.out.println("3 - |  ___  |");
			System.out.println("4 - |  ---  |");
			System.out.println("Introduce el número de la opción elegida para la boca (1-4):");
			opcionBoca = in.nextInt();
			if (opcionBoca < 1 || opcionBoca > 4)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (opcionBoca < 1 || opcionBoca > 4);
		
		switch (opcionPelo) {
			case 1:
				System.out.println("WWWWWWWWW");
				break;
			case 2:
				System.out.println("\\\\\\//////");
				break;
			case 3:
				System.out.println("|\"\"\"\"\"\"\"|");
				break;
			case 4:
				System.out.println("|||||||||");
		}
		switch (opcionOjos) {
			case 1:
				System.out.println("|  O O  |");
				break;
			case 2:
				System.out.println("|-(· ·)-|");
				break;
			case 3:
				System.out.println("|  ___  |");
				break;
			case 4:
				System.out.println("|  \\ /  |");
		}
		switch (opcionNariz) {
			case 1:
				System.out.println("@   J   @");
				break;
			case 2:
				System.out.println("{   \"   }");
				break;
			case 3:
				System.out.println("[   j   ]");
				break;
			case 4:
				System.out.println("<   -   >");
		}
		switch (opcionBoca) {
			case 1:
				System.out.println("|  ===  |");
				break;
			case 2:
				System.out.println("|   -   |");
				break;
			case 3:
				System.out.println("|  ___  |");
				break;
			case 4:
				System.out.println("|  ---  |");
		}
		System.out.println(" \\_____/ ");
	}
	
}
