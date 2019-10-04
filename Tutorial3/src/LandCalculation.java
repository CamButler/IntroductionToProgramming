
public class LandCalculation {

	public static void main(String[] args) {
	
	int feetPerAcre = 43560;
	int tract = 389767;
	double acres; 
	acres = tract / feetPerAcre;
	//System.out.println("A tract of land with " + tract + " square feet has " +  acres + " acres.");
	System.out.printf("A tract of land with %d square feet has %.2f acres.",tract, acres);
	}
}

	
	

