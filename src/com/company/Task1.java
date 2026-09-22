package com.company;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);
    static int [][] a = new int [5][5];

    public static void read(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                a[i][j] = scanner.nextInt();
            }
        }
    }
    public static void write(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void task(int k){
        read();
        write();
        System.out.println();
        int c = 0,f = 0;
        while(k>0) {
            for (int i = 0; i < 5; i++) {
                f = a[i][0];
                for (int j = 0; j < 4; j++) {
                    c = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1] = c;
                }
                a[i][4] = f;
            }
            k-=1;
        }
        write();
    }
    public static void main(String[] args) {
        task(2);
    }
}
