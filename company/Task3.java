package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static void read(int n){
        for(int i =0;i<n;i++){
            numbers.add(scanner.nextInt());
        }
    }
    public static int count(int n){
        int q = 0, k = n;
        while(n>0){
            q+=k%10;
            k/=10;
        }
        if(q%2==0) return q;
        else return 0;
    }
    
    public static void main(String[] args) {

    }
}
