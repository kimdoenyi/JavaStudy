package com.study.plus.chap02;

import java.util.Scanner;

public class GCD2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdRes = gcd(a, b);
        int lcm = a*b/gcdRes;

        System.out.println(gcdRes);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a%b);
        }
    }

}
