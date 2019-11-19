/* Sistema de Aviões */
//Patterns Façade, State, AbstractFactory
public class Main {

	public static void main(String[] args) {
		// Modo 1
		Facade planeFacade = new Facade();

		planeFacade.createEmbraer();
		planeFacade.info();
		planeFacade.createLockheed();
		planeFacade.info();

	}
}
