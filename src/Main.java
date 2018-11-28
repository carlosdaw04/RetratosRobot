import java.util.Scanner;

public class Main {
	
	static Scanner in = new Scanner(System.in);
	static String [][] rasgos = {
		{"pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
		{"ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |"},
		{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
		{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
		{"barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	static String obtenerRasgo(int faccion) {
		int rasgo;
		for (int i=1; i<rasgos[faccion].length; i++)
			System.out.println(i + " - " + rasgos[faccion][i]);
		do {
			System.out.println("Elige la opción para " + rasgos[faccion][0] + " (1-" + (rasgos[faccion].length - 1) + "):");
			rasgo = in.nextInt();
			if (rasgo < 1 || rasgo > rasgos[faccion].length)
				System.out.println("La opción elegida no es correcta. Vuelve a introducirla");
		} while (rasgo < 1 || rasgo > rasgos[faccion].length);
		return rasgos[faccion][rasgo];
	}
	
	public static void main(String[] args) {
		
		String [] retrato = new String[5];
		for (int faccion=0; faccion<retrato.length; faccion++)
			retrato[faccion] = obtenerRasgo(faccion);
		for (int faccion=0; faccion<retrato.length; faccion++)
			System.out.println(retrato[faccion]);
	}
	
}
