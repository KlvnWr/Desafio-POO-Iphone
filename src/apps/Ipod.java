package apps;

public class Ipod {
	public static void tocar() {
		System.out.println("Tocando a musica");
	}

	public static void pausar() {
		System.out.println("Pausando a música");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando a música " + musica);
		tocar();
	}
}
