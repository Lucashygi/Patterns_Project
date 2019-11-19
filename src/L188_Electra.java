
public class L188_Electra implements PropellerPlane {

	private String modelo;
	private String tipo;
	private int passageiros;
	private int velocidadeMaxima;
	private int peso;
	private Decolar decola;
	private Pousar pousa;

	public L188_Electra() {
		this.modelo = "Lockheed L188 Electra";
		this.tipo = "Turboelice";
		this.passageiros = 98;
		this.velocidadeMaxima = 721;
		this.peso = 26036;
		this.decola = new DecolarChuva();
		this.pousa = new PousarChuva();
	}

	@Override
	public void infoPropellerPlane() {
		System.out.println("Avião: " + modelo);
		System.out.println("Propulsão: " + tipo);
		System.out.println("Quantidade de Passageiros: " + passageiros);
		System.out.println("Peso vazio: " + peso);
		System.out.println("Velocidade Máxima: " + velocidadeMaxima);
	}

	@Override
	public void Decolagem() {
		this.decola.decolar();
	}

	@Override
	public void Pouso() {
		this.pousa.pousar();
	}

	@Override
	public void setDecolagem(Decolar modo) {
		this.decola = modo;
	}

	@Override
	public void setPouso(Pousar modo) {
		this.pousa = modo;
	}

}
