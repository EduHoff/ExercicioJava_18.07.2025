package entities;

public final class Company extends TaxPayer {
	
	private Integer numberOfEmployers;
	
	public Company() {
		
	}

	public Company(String name, Double anualInComing, Integer numberOfEmployers) {
		super(name, anualInComing);
		this.numberOfEmployers = numberOfEmployers;
	}

	@Override
	public Double tax() {
		
		double tax;
		
		if(numberOfEmployers > 10) {
			tax = getAnualInComing() * 0.14;
		}else {
			tax = getAnualInComing() * 0.16;
		}
			
		return tax;
	}

	public Integer getNumberOfEmployers() {
		return numberOfEmployers;
	}

	public void setNumberOfEmployers(Integer numberOfEmployers) {
		this.numberOfEmployers = numberOfEmployers;
	}

}
