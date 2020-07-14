package com.example.demo.sumofprimes;

public class SumOfPrimesDemo1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i <= 200000; i++){
            if(prime(i)){
                count += i;
            }
        }
        System.out.println("20万以下所有质数的和等于" + count);
}
    public static boolean prime(int num){
        if(num == 1) return false;
        for(int m = 2; m <= Math.sqrt(num); m++){
            if(num%m == 0){
                return false;
            }
        }
        return true;
    }
}
