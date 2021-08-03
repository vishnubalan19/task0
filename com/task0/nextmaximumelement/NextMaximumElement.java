package com.task0.nextmaximumelement;
import java.util.Scanner;

public class NextMaximumElement {
    public void method(){
        Scanner scanner = new Scanner(System.in);
        try{
            int size = scanner.nextInt();
            int [] array = new int [size];
            for(int i=0;i<size;i++){
                array[i] = scanner.nextInt();
            }
            int max;
            for(int i=0;i<size-1;i++){
                max=0;
                for(int j=i+1;j<size;j++){
                    if(max<array[j])
                        max=array[j];
                }
                System.out.print(max+" ");
            }
            System.out.print("-1");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
    public static void main(String [] args){
        new NextMaximumElement().method();
    }
}
