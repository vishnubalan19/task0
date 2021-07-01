import java.util.*;
class ob{
	public void method(){
		Scanner sc = new Scanner(System.in);
		try{
			int amount = sc.nextInt();
			int h=0,th=0,fh=0,tt=0;
			if(amount >=100){
				if(amount>=100){
					h++;
					amount-=100;
				}
				if(amount>=200){
					th++;
					amount-=200;
				}
				if(amount>=500){
					fh++;
					amount-=500;
				}
				if(amount>=2000){
					tt++;
					amount-=2000;
				}
				while(amount!=0){
					if(amount>=2000)
					{
						tt++;
						amount-=2000;
					}
					else if(amount>=500){
						fh++;
						amount-=500;
					}
					else if(amount>=200){
						th++;
						amount-=200;
					}
					else if(amount>=100){
						h++;
						amount-=100;
					}
				}
				if(tt>0)
					System.out.println(tt+"*2000");
				if(fh>0)
					System.out.println(fh+"*500");
				if(th>0)
					System.out.println(th+"*200");
				if(h>0)
					System.out.println(h+"*100");
			}
			else{
				return;
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
class p3{
	public static void main(String [] args){
		new ob().method();
	}
}