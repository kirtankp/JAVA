package Patterns;

public class Patterns {

	public static void rhombus(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void diamond(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n-1; i > 0; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void zeroOne(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i+j)%2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println( );
		}
		
		System.out.println();
		//alternate approach
		for (int i = 1; i <= n; i++) {
			//ternary operator
			int k = (i%2 == 0)? 0:1 ;
			for (int j = 1; j <= i; j++) {
				System.out.print(k+" ");
				k = (k == 0)? 1:0 ;
			}
			System.out.println( );
		}
	}
	
	public static void butterfly(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= (2*n)-(2*i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i > 0; i--){
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= (2*n)-(2*i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println("Rhombus");
		System.out.println();
		rhombus(n);
		System.out.println();
		System.out.println("Diamond");
		System.out.println();
		diamond(n);
		System.out.println();
		System.out.println("Zero One Triangle");
		System.out.println();
		zeroOne(n);
		System.out.println();
		System.out.println("ButterFly");
		System.out.println();
		butterfly(n);
	}

}
