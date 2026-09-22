package com.company;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);
    static int[][] a = new int[5][5];

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
    public static void task2(int i,int k){
        int q = 0;
        for(int j = 0;j<5;j++){
            if(a[i][j]>=10 && a[i][j]<=99) q+=1;
        }
        if(q==k){
            for(int j = 0;j<5;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int mamain(){
        int ma = a[0][0];
        for(int i = 0;i<5;i++){
            if(a[i][i]>ma) ma = a[i][i];
        }

        return ma;
    }
    public static int masec(){
        int ma = a[0][4];
        for(int i = 0;i<5;i++){
            if(a[i][4-i]>ma) ma = a[i][4-i];
        }

        return ma;
    }
    public static void task(){
        read();
        write();
        System.out.println(mamain());
        System.out.println(masec());
        System.out.println();
        for(int i = 0;i<5;i++){
            task2(i,2);
        }
    }
    public static void main(String[] args) {
        task();
    }
}
