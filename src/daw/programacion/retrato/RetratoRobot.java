package daw.programacion.retrato;

import java.awt.Color;

public class RetratoRobot {

	private static String [][] rasgos = {
			{"pelo", "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||"},
			{"ojos", "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |"},
			{"nariz", "@   J   @", "{   \"   }", "[   j   ]", "<   -   >"},
			{"boca", "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |"},
			{"barbilla", "\\_______/", "\\,,,,,,,/"}
	};
	
	private String pelo;
	private String ojos;
	private String nariz;
	private String boca;
	private String barbilla;
	private Color color;
	
	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		this(pelo, ojos, nariz, boca, barbilla, Color.WHITE);
	}

	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla, Color color) {
		this.pelo = rasgos[0][pelo];
		this.ojos = rasgos[1][ojos];
		this.nariz = rasgos[2][nariz];
		this.boca = rasgos[3][boca];
		this.barbilla = rasgos[4][barbilla];
		this.color = color;
	}
	 
	@Override
	public String toString() {
		return pelo + System.getProperty("line.separator") +
				ojos + System.getProperty("line.separator") +
				nariz + System.getProperty("line.separator") +
				boca + System.getProperty("line.separator") +
				barbilla;
	}
}
