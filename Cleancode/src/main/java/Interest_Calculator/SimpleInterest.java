package Interest_Calculator;

public class SimpleInterest extends InterestCalculator {

	public void SimpleInterest() {
		
	}
	public SimpleInterest(Double principal ,Double rateofInterest, Double timeperiod) {
		
		this.pamount=principal;
		this.roInterest = rateofInterest;
		this.tperiod= timeperiod;
	
	}
	
	public Double getSimpleInterest() {
		
		return ((pamount * tperiod * roInterest)/100);
		
	}
}
