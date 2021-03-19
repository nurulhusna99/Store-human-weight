import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      System.out.print("Input weight in earth : ");
	      double weight = sc.nextDouble();
	      double Mars = (weight / 9.81) * 3.711;
	      System.out.print("\nThe Body Mass In Mars is " + Mars + " kg/m2");

	}

}
