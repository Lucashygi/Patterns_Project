
public class FabricaLockheed implements PlaneFactory{

	public FabricaLockheed() {
		
	}

	@Override
	public JetPlane criaJato() {
		return new JetStar();
	}

	@Override
	public PropellerPlane criaTurboelice() {
		return new L188_Electra();
	}
	
	
}
