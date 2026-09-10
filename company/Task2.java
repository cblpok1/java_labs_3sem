package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static void read(int n){
        for(int i =0;i<n;i++){
            numbers.add(scanner.nextInt());
        }
    }

    public static boolean prime(int n){
        if(n<=1) return false;
        for(int i = 2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int maximum(){
        int ma = 0,q = 0,k=0,ind = 0;
        for(int i = 0;i<primeNumbers.size();i++){
            k = primeNumbers.get(i);
            while(k>0){
                q+=k%10;
                k/=10;
            }
            if(q>ma) {
                ma = q;
                ind = i;
            }
            q = 0;
        }
        return ind;
    }
    public static void task(){
        read(5);
        for(int i = 0;i<numbers.size();i++){
            if(prime(numbers.get(i))){
                primeNumbers.add(numbers.get(i));
            }
        }
        System.out.println(primeNumbers.get(maximum()));
        scanner.close();

    }
    public static void main(String[] args) {
        task();
    }
}
