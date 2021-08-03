package com.task0.atm;

import java.util.Scanner;

public class Atm {
    public void method(){
        Scanner scanner = new Scanner(System.in);
        try{
            int amount = scanner.nextInt();
            int hundred=0,thundred=0,fhundred=0,tthousand=0;
            if(amount >=100){
                if(amount>=100){
                    hundred++;
                    amount-=100;
                }
                if(amount>=200){
                    thundred++;
                    amount-=200;
                }
                if(amount>=500){
                    fhundred++;
                    amount-=500;
                }
                if(amount>=2000){
                    tthousand++;
                    amount-=2000;
                }
                while(amount!=0){
                    if(amount>=2000)
                    {
                        tthousand++;
                        amount-=2000;
                    }
                    else if(amount>=500){
                        fhundred++;
                        amount-=500;
                    }
                    else if(amount>=200){
                        thundred++;
                        amount-=200;
                    }
                    else if(amount>=100){
                        hundred++;
                        amount-=100;
                    }
                }
                if(tthousand>0)
                    System.out.println(tthousand+"*2000");
                if(fhundred>0)
                    System.out.println(fhundred+"*500");
                if(thundred>0)
                    System.out.println(thundred+"*200");
                if(hundred>0)
                    System.out.println(hundred+"*100");
            }
            else{
                return;
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
        new Atm().method();
    }
}
