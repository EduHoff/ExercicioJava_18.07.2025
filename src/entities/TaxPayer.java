package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anualInComing;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String name, Double anualInComing) {
		this.name = name;
		this.anualInComing = anualInComing;
	}
	
	public abstract Double tax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualInComing() {
		return anualInComing;
	}

	public void setAnualInComing(Double anualInComing) {
		this.anualInComing = anualInComing;
	}
	
	

	
}
