package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static Scanner scanner = new Scanner(System.in);

    public static int count(int n,int i){
        int q = 0;
        while(n>0){
            if(n%10==i){
                q+=1;
            }
            n/=10;
        }
        return q;
    }
    public static boolean quality(int n){
        int q = 0;
        while(n>0){
            n/=10;
            q+=1;
        }
        if(q%2==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void read(int n){
        for(int i =0;i<n;i++){
            numbers.add(scanner.nextInt());
        }
    }
    public static void task(){
        read(5);
        System.out.println(numbers);
        int n = scanner.nextInt();
        for(int i = 0;i<numbers.size();i++){
            if(quality(numbers.get(i))){
                numbers.set(i,count(numbers.get(i),n));//answers.add(count(numbers.get(i),n));
            }
            else{
                numbers.set(i,0);
            }
        }
        System.out.println(numbers);
        scanner.close();
    }
    public static void main(String[] args) {
        task();
    }
}
