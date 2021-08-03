package com.task0.dialpadsystem;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DialPadSystem {
    public void method(){
        Scanner scanner = new Scanner(System.in);
        try{
            HashMap<Integer,String> hashmap = new HashMap<>();
            hashmap.put(2,"ABC");
            hashmap.put(3,"DEF");
            hashmap.put(4,"GHI");
            hashmap.put(5,"JKL");
            hashmap.put(6,"MNO");
            hashmap.put(7,"PQRS");
            hashmap.put(8,"TUV");
            hashmap.put(9,"WXYZ");
            String temp = scanner.nextLine();
            char [] array = temp.toCharArray();
            int dialpad=0,in=0,prev=0;
            for(int i =0;i<array.length;i++){
                if(array[i]==' ')
                    System.out.print(" ");
                else{
                    for(Map.Entry<Integer,String> entry:hashmap.entrySet()){
                        String value =entry.getValue();
                        if(value.indexOf(Character.toUpperCase(array[i]))>=0){
                            dialpad = entry.getKey();
                            in = value.indexOf(Character.toUpperCase(array[i]))+1;
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
            scanner.close();
        }
    }
    public static void main(String [] args){
        new DialPadSystem().method();
    }
}
