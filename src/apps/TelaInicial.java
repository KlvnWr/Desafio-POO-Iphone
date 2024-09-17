package apps;

public class TelaInicial {
	public static void main(String[] args) {
		Ipod ipod = new Ipod();
		Phone phone = new Phone();
		Safari safari = new Safari();

		ipod.selecionarMusica("Flor e Beija Flor");
		phone.ligar("14 93500-7578");
		safari.atualizarPagina();
	}
}
