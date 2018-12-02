package Example;
import java.util.Scanner;
public class CH5_1_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CashCard cc=new CashCard("A001",500,0);
		
	}
}
class CashCard{
	private String number;
	private int balance;
	private int bonus;
	public CashCard() {
		//do nothing
	}
	CashCard(String number,int balnce,int bonus){
		this.number=number;
		this.balance=balance;
		this.bonus=bonus;
	}
}
