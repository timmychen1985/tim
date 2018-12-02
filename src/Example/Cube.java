package Example;


public class Cube {
	double length;
	public Cube() {}
	public Cube(double length) throws CubeException{
		setLength(length);
	}

	public void setLength(double length) throws CubeException{
		if(length>0) {
			this.length = length;
			}else {
				throw new CubeException("½Ð¿é¤J0");
			}
		}
	

	public double getLength() {
		return length;
	}

	public void square() {
		System.out.println(length * length);
	}
	public double getSum() {
		
		return Math.pow(length, 3);
	}
}
