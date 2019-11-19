
public class FabricaEmbraer implements PlaneFactory{
	
	public FabricaEmbraer() {
	}

	@Override
	public JetPlane criaJato() {
		return new Embraer_190();
	}

	@Override
	public PropellerPlane criaTurboelice() {
		return new CBA123_Vector();
	}

}
