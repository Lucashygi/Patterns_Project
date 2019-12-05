
 // Patern Façade
 
public class Facade {

	PlaneFactory factory;
	JetPlane jetplane;
	PropellerPlane propplane;

	public Facade() {

	}

	// Modo 1
	public void createEmbraer() {
		factory = new FabricaEmbraer();
		jetplane = factory.criaJato();
		propplane = factory.criaTurboelice();
	}

	public void createLockheed() {
		factory = new FabricaLockheed();
		jetplane = factory.criaJato();
		propplane = factory.criaTurboelice();
	}

	public void info() {
		jetplane.infoJetPlane();
		jetplane.Decolagem();
		jetplane.setPouso(new PousarSol());
		jetplane.Pouso();
		System.out.println();

		propplane.infoPropellerPlane();
		propplane.Decolagem();
		propplane.setPouso(new PousarChuva());
		propplane.Pouso();
		System.out.println();
	}

}
