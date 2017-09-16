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
		this.SKBR3Expression = exp1;
		this.HCC1569Expression = exp2;
		this.SKBR3Percentile = perc1;
		this.HCC1569Percentile = perc2;
		this.D1minD2 = min1;
		this.D2minD1 = min2;
		this.D1divD2 = div1;
		this.D2divD1 = div2;
	}
	
	public String getName() {
		return geneName;
	}
	
	public void setName(String name) {
		this.geneName = name;
	}
	
	public int getExp1() {
		return SKBR3Expression;
	}
	
	public void setExp1(int exp1) {
		this.SKBR3Expression = exp1;
	}
	
	public int getExp2() {
		return HCC1569Expression;
	}
	
	public void setExp2(int exp2) {
		this.HCC1569Expression = exp2;
	}
	
	public double getPerc1() {
		return SKBR3Percentile;
	}
	
	public void setPerc1(double perc1) {
		this.SKBR3Percentile = perc1;
	}
	
	public double getPerc2() {
		return HCC1569Percentile;
	}
	
	public void setPerc2(double perc2) {
		this.HCC1569Percentile = perc2;
	}
	
	public int getMin1() {
		return D1minD2;
	}
	
	public void setMin1(int min1) {
		this.D1minD2 = min1;
	}
	
	public int getMin2() {
		return D2minD1;
	}
	
	public void setMin2(int min2) {
		this.D2minD1 = min2;
	}
	
	public int getDiv1() {
		return D1divD2;
	}
	
	public void setDiv1(int div1) {
		this.D1divD2 = div1;
	}
	
	public int getDiv2() {
		return D2divD1;
	}
	
	public void setDiv2(int div2) {
		this.D2divD1 = div2;
	}
	
	@Override
	public String toString() {
		return "Gene [geneName=" + geneName + ", SKBR3Expression=" + SKBR3Expression + ", HCC1569Expression=" + HCC1569Expression +
				", SKBR3Percentile=" + SKBR3Percentile + ", HCC1569Percentile=" + HCC1569Percentile + ", D1-D2=" + D1minD2 + 
				", D2-D1=" + D2minD1 + ", D1/D2=" + D1divD2 + ", D2/D1=" + D2divD1 + "]";
	}
}
