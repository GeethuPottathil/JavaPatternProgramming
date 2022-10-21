
public class Alphabets {
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == (n - 1) / 2) || ((j > 0 && j < n - 1 && i == 0)) || ((i > 0 && i <= n - 1 && j == 0))
						|| ((i > 0 && i <= n - 1 && j == n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.print("    ");
			// Printing B
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n - 1) || (j == n - 1 && i < (n - 1) / 2 && i > 0)
						|| (j == n - 1 && i < (n - 1) && i > (n - 1) / 2) || (i == ((n - 1) / 2) && j < (n - 1))
						|| (i == 0 && j < (n - 1)) || (i == n - 1 && j < (n - 1))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing C
			for (int j = 0; j < n; j++) {
				if ((j > 0 && i == 0) || (j > 0 && i == n - 1) || (j == 0 && j > 0) || (i > 0 && j == 0 && i < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing D

			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j < n - 3) || (j == n - 1 && i > 1 && i < n - 2) || (i == n - 1 && j < n - 3)
						|| (j == n - 2 && i == 1) || (i == n - 2 && j == n - 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing E
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (i == (n - 1) / 2) || (i == n - 1) || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing F
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (i == (n - 1) / 2) || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing G
			for(int j=0;j<n;j++) {
				if((j==(n-1)&&i>(n-1)/2) || (i==(n-1)/2 && j>(n-1)/2) || (j==(n-1)/2 && i>=(n-1)/2 &&i<n-1) || (i==n-1 && j<(n-1)/2 && j>0) ||
						(j==0 && i<n-1 && i>0) || (i==0 && j>0)
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing H
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		
			System.out.print("    ");
			// Printing I
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing J
			for(int j=0;j<n;j++) {
				if(i==0 || (j==(n-1)/2 && i<n-1) || ((i==n-1) && j<((n-1)/2)) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing K
			for(int j=0;j<n;j++) {
				if(j==0 ||j+i==(n-1)/2 || (i-j ==(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing L
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing M
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || (i==j && i<(n/2)) || ((i+j==n-1)&&i<(n/2))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing N
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing O
			for(int j=0;j<n;j++) {
				if((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i>0 && i <n-1) || (j==n-1 && i>0 && i <n-1) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing P
			for(int j=0;j<n;j++) {
				if((j==0) || (i==0 && j<n-1) || (j==n-1 && i>0 && i<(n-1)/2) || (i==(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing Q
			for(int j=0;j<n;j++)
			{
				if(i==0 && j>0 && j<n-1 || j==0 && i>0 && i<n-1 || j==n-1 && i<n-1 && i>0 ||i==n-1 && j>0 && j<n-1 || (i==j) && i>n/2 && j>n/2)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing R
			for(int j=0;j<n;j++) {
				if( j==0 || (i==0 && j<n-1) || (i==(n-1)/2 && j<n-1) || (i!=(n-1)/2 && j==n-1 && i!=0)	) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing S
			for(int j=0;j<n;j++) {
				if((i==0 && j>0) || (i==n-1 && j<n-1) || (j==(n-1) && i>(n-1)/2 && i<n-1) ||
						(i==(n-1)/2 && j<n-1 && j>0) || (j==0 && i>0 && i<(n-1)/2) ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing T
			for(int j=0;j<n;j++) {
				if((i==0) || j==(n-1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
//			// Printing U
			for(int j=0;j<n;j++) {
				if((j==0 && i<n-1) || (j==n-1 && i<n-1) || (i==n-1 && j>0 && j<n-1) ){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			//Printing V
			for(int j=0;j<2*n;j++) {
				if((i==j && i<=(n-1)/2) || (i+j==(n-1) && i<(n-1)/2) ) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing W
			for(int j=0;j<2*n;j++)
			{

				if(i+j==(n-1) && i>(n-1)/2 || (j==i && i>(n-1)/2  ) || j==0 || j==n-1 )
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//System.out.print("    ");
			
			// Printing X
			for(int j=0;j<n;j++) {
				if((i==j) || (i+j==(n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing Y
			for(int j=0;j<n;j++) {
				if((i==j && i<(n-1)/2) || (i+j==n-1 && i<(n-1)/2) || (i>=(n-1)/2 && j==(n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			// Printing Z
			for(int j=0;j<n;j++) {
				if((i==0)||(i==n-1)||(i+j==n)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}
	}
}
