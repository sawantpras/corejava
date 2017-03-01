
public class Prime {
	public static void main(String args[]) {
		int a = 18;
		int c = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				c = c + 1;
		}
		if (c == 2)

			System.out.println(a+ " number is Prime ");
		else
			System.out.println("given number is not prime");

	}
}
