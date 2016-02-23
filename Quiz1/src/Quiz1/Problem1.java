package Quiz1;
import java.util.Scanner;

public class Problem1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many touchdowns?");
		int td = sc.nextInt();
		System.out.println("Total yards?");
		int yard = sc.nextInt();
		System.out.println("How many interceptions?");
		int inter = sc.nextInt();
		System.out.println("How many completions?");
		int comp = sc.nextInt();
		System.out.println("How many passes were attempted?");
		int pa = sc.nextInt();

		double a = fourmula1(comp, pa);
		double b = fourmula2(yard, pa);
		double c = fourmula3(td, pa);
		double d = fourmula4(inter, pa);
		double pr = ((a + b + c + d) / 6) * 100;

		System.out.println("The passer rating is " + pr);
	}

	public static double fourmula1(int comp, int pa) {
		return ((comp / pa) - .3) * 5;
	}

	public static double fourmula2(int yard, int pa) {
		return ((yard / pa) - 3) * .25;
	}

	public static double fourmula3(int td, int pa) {
		return (td / pa) * 25;
	}

	public static double fourmula4(int inter, int pa) {
		return 2.375 - ((inter / pa) * 25);
	}
}
