package Example;

public class Ests {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Please Enter THE TYPE");
		String id =sc.nextLine();
		sc.close();
		String checkid="[A-Za-z][12]\\d{8}$";
		if(id.matches(checkid)) {
			System.out.println("ok");
		}else {
			System.out.println("no good");
		}
	}
}
