import java.util.*;
class ob{
	public void method(){
		Scanner sc = new Scanner(System.in);
		try{
			int n = sc.nextInt();
			int i=0;
			String a = "1";
			String o="";
			int val =0;
			while(i<n){
				char []arr = a.toCharArray();
				int temp = arr[0] - '0';
				for(int j =0;j<a.length();j++){
					if(temp!=(arr[j] - '0')){
						o+=val;
						o+=temp;
						val=0;
						temp = arr[j] -'0';
					}
					//else
						val++;
				}
				//val++;
				o+=val;
				o+=temp;				
				i++;
				System.out.println(o);
				a=o;
				//System.out.println(a);
				val =0;
				o="";
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}
	}
}
class p6{
	public static void main(String [] args){
		new ob().method();
	}
}