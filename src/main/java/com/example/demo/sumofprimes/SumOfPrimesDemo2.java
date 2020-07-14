package com.example.demo.sumofprimes;

public class SumOfPrimesDemo2 {
    public static void main(String[] args) {

        int count = 0;
        for (int m = 1; m <= 200000; m++) {
            boolean flag = true;
            if (m == 1) continue;
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    flag = false;
                    continue;
                }
            }

            if (flag) {
                count += m;
            }
        }

        System.out.println("20万以下所有质数的和等于" + count);
    }
}
