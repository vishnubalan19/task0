import java.util.*;
class ob{
	public void method(){
		Scanner sc = new Scanner(System.in);
		try{
			int n = sc.nextInt();
			int [] a = new int [n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			int max;
			for(int i=0;i<n-1;i++){
				max=0;
				for(int j=i+1;j<n;j++){
					if(max<a[j])
						max=a[j];
				}
				System.out.print(max+" ");
			}
			System.out.print("-1");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}
}
class p4{
	public static void main(String [] args){
		new ob().method();
	}
}