package com.task0.lookandsaysequence;

import java.util.Scanner;

public class LookAndSaySequence {
    public void method(){
        Scanner scanner = new Scanner(System.in);
        try{
            int number = scanner.nextInt();
            int i=0;
            String sequence = "1";
            String string="";
            int val =0;
            while(i<number){
                char []arr = sequence.toCharArray();
                int temp = arr[0] - '0';
                for(int j =0;j<sequence.length();j++){
                    if(temp!=(arr[j] - '0')){
                        string+=val;
                        string+=temp;
                        val=0;
                        temp = arr[j] -'0';
                    }
                    //else
                    val++;
                }
                //val++;
                string+=val;
                string+=temp;
                i++;
                System.out.println(string);
                sequence=string;
                //System.out.println(a);
                val =0;
                string="";
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
        new LookAndSaySequence().method();
    }
}
