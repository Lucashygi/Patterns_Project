
public class CBA123_Vector implements PropellerPlane {

	private String modelo;
	private String tipo;
	private int passageiros;
	private int velocidadeMaxima;
	private int peso;
	private Decolar decola;
	private Pousar pousa;

	public CBA123_Vector() {
		this.modelo = "Embraer CBA-123 Vector";
		this.tipo = "Turboelice";
		this.passageiros = 19;
		this.velocidadeMaxima = 593;
		this.peso = 4900;
		this.decola = new DecolarSol();
		this.pousa = new PousarSol();
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
