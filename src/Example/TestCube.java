package Example;

public class TestCube {
	public static void main(String[] args) {
			
		try {
			Cube a=new Cube(0);
			System.out.println(a);
		} catch (CubeException e) { 
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
