package Interest_Calculator;

public class CompoundInterest extends InterestCalculator {
	
	public CompoundInterest() {
		
	}
	public CompoundInterest(Double principal,Double rateofInterest , Double timeperiod) {
		
		this.pamount=principal;
		this.roInterest=rateofInterest;
		this.tperiod=timeperiod;
		
	}
	public Double getCompoundInterest() {
		
		return (pamount * Math.pow(1.0 + roInterest / 100.0, tperiod) - pamount);
		
	}

}
