package additionalClasses;

public class Apple {
	private int weight = 0;
	private String color = "";
	private String country = "";
	
	public Apple(int weight, String color){
		this.weight = weight;
		this.color = color;
	}
	

	public Apple(int weight, String color, String country) {
		super();
		this.weight = weight;
		this.color = color;
		this.country = country;
	}


	public Integer getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color
				+ ", country=" + country + "]";
	}

	
}