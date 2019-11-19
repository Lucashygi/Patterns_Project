
public class JetStar implements JetPlane {

	private String modelo;
	private String tipo;
	private int passageiros;
	private int velocidadeMaxima;
	private int peso;
	private Decolar decola;
	private Pousar pousa;

	public JetStar() {
		this.modelo = "Lockheed JetStar";
		this.tipo = "Turbofan";
		this.passageiros = 10;
		this.velocidadeMaxima = 883;
		this.peso = 18840;
		this.decola = new DecolarSol();
		this.pousa = new PousarSol();
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
