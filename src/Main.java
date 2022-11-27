import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcases = sc.nextInt();
		for (int i=0;i<testcases;i++) {
			doTestCase();
		}
	}

	private static void doTestCase() {
		// TODO Auto-generated method stub
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(getNumPrimes(a,b));
	}

	private static int getNumPrimes(int a, int b) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=a;i<b;i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if (num == 1) return false;
		if (num == 2) return true;
		
		for (int i=2;i<=(int)Math.sqrt(num);i++) {
			if (num % i==0) {
				return false;
			}
		}
		
		return true;
	}

}
