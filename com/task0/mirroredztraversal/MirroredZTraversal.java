package com.task0.mirroredztraversal;

import java.util.Scanner;

public class MirroredZTraversal {
    public void method() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        try {
            int[][] array = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            if (size == 1)
                System.out.print(array[0][0]);
            else {
                for (int i = size - 1; i >= 0; i--) {
                    System.out.print(array[0][i]);
                }
                for (int i = 1; i <= size - 2; i++)
                    System.out.print(array[i][i]);
                for (int i = size - 1; i >= 0; i--)
                    System.out.print(array[size - 1][i]);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static void main(String [] args){
        new MirroredZTraversal().method();
    }
}
