package daw.programacion.retrato;

public enum Pelo {
	A("WWWWWWWWW"), B("\\\\\\//////"), C("|\"\"\"\"\"\"\"|"), D("|||||||||");
	
	private String rasgo;
	
	private Pelo(String valor) {
		this.rasgo = valor;
	}
	
	public String get() {
		return rasgo;
	}
}