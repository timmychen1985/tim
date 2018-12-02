package Example;
public class Powder {
	private String color; 
	private double weight;
	
	public Powder() {
		super();
	}
	
	public Powder(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}
	
	public void getWeightMethod() {
		System.out.println("����"+this.color);
		System.out.println("�ϥΤѯ�"+this.weight);
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
