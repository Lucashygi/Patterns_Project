
public class Embraer_190 implements JetPlane {

	private String modelo;
	private String tipo;
	private int passageiros;
	private int velocidadeMaxima;
	private int peso;
	private Decolar decola;
	private Pousar pousa;

	public Embraer_190() {
		this.modelo = "Embraer 190";
		this.tipo = "Turbofan";
		this.passageiros = 114;
		this.velocidadeMaxima = 890;
		this.peso = 28080;
		this.decola = new DecolarChuva();
		this.pousa = new PousarChuva();
	}

	@Override
	public void infoJetPlane() {
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
