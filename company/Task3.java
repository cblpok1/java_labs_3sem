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
        while(k>0){
            q+=k%10;
            k/=10;
        }
        if(q%2==0) return q;
        else return 0;
    }

    public static void task(){
        read(5);
        int k = 0,c = 0;
        for(int i = 0;i<numbers.size();i++){
            k = 0;
            if(count(numbers.get(i))!=0){
                c = numbers.get(i);
                while(c>0){
                    k=k*10+c%10;
                    c/=10;
                }
                numbers.set(i,k);
            }
        }
        System.out.println(numbers);
    }
    
    public static void main(String[] args) {
        task();
    }
}
