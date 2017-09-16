package binf;

public class Gene {
	private String geneName = "";
	private int SKBR3Expression = 0;
	private int HCC1569Expression = 0;
	private double SKBR3Percentile = 0.0;
	private double HCC1569Percentile = 0.0;
	private int D1minD2 = 0;
	private int D2minD1 = 0;
	private int D1divD2 = 0;
	private int D2divD1 = 0;
	
	public Gene(String name, int exp1, int exp2, double perc1, double perc2, int min1, int min2, int div1, int div2) {
		this.geneName = name;
				
	}
}
