import java.util.*;
class ob{
	public void method(){
		Scanner sc = new Scanner(System.in);
		try{
			HashMap <Integer,String> hm = new HashMap<>();
			hm.put(2,"ABC");
			hm.put(3,"DEF");
			hm.put(4,"GHI");
			hm.put(5,"JKL");
			hm.put(6,"MNO");
			hm.put(7,"PQRS");
			hm.put(8,"TUV");
			hm.put(9,"WXYZ");
			String s = sc.nextLine();
			char [] a = s.toCharArray();
			int dialpad=0,in=0,prev=0;
			for(int i =0;i<a.length;i++){
				if(a[i]==' ')
					System.out.print(" ");
				else{
					for(Map.Entry<Integer,String> entry:hm.entrySet()){
						String v =entry.getValue();
						if(v.indexOf(Character.toUpperCase(a[i]))>=0){
							dialpad = entry.getKey();
							in = v.indexOf(Character.toUpperCase(a[i]))+1;
							if(prev==dialpad)
								System.out.print(" ");
						}
					}
					for(int j =0;j<in;j++)
						System.out.print(dialpad);
					prev = dialpad;
				}
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
class p7{
	public static void main(String [] args){
		new ob().method();
	}
}