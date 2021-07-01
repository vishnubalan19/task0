import java.util.*;
class ob{
	public void method(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try{
			int [][]a = new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					a[i][j]= sc.nextInt();
				}
			}
			if(n==1)
				System.out.print(a[0][0]);
			else{
				for(int i = n-1;i>=0;i--){
					System.out.print(a[0][i]);
				}
				for(int i =1;i<=n-2;i++)
					System.out.print(a[i][i]);
				for(int i=n-1;i>=0;i--)
					System.out.print(a[n-1][i]);
			}
		}
		catch(Exception e){
			System.out.print(e.getMessage());}
		finally{
			sc.close();
		}
	}
}
class p2{
	public static void main(String [] args){
		new ob().method();
	}
}