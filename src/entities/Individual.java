package entities;

public final class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		
	}
	

	public Individual(String name, Double anualInComing, Double healthExpenditures) {
		super(name, anualInComing);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		
		double tax;
		
		if(getAnualInComing() < 20000) {
			tax = getAnualInComing() * 0.15;
		}else {
			tax = getAnualInComing() * 0.25;
		}
		
		if(healthExpenditures > 0) {
			tax = tax - (healthExpenditures*0.5);
		}
		
		if(tax < 0) {
			tax = 0;
		}
		
		return tax;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}


	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	

}
