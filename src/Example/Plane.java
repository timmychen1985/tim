package Example;
public class Plane {
	private String kind;     
	private double weight;
	
	public Plane() {
		super();
	}

	public Plane(String kind, double weight) {
		super();
		this.kind = kind;
		this.weight = weight;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getWeight() {
		return weight;
	}
	
	public void getWeightMethod() {
		System.out.println("������"+this.kind);
		System.out.println("�ϥΦa�S"+this.weight);
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}
