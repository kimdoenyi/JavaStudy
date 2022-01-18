package com.study.plus.chap02;

import java.util.Scanner;

public class GCD2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdRes = 0;
        int lcm = 0;

        if(a > b) {
            gcdRes = gcd(a,b);
        } else {
            gcdRes = gcd(b, a);
        }

        if(gcdRes == 0) {
            gcdRes = lcm = a*b;
        } else {
            lcm = a * b /gcdRes;
        }

        System.out.println(gcdRes);
        System.out.println(lcm);
    }

    static int gcd(int a, int b) {

        int res = 0;

        while(true) {
            res = a % b;

            if(res == 0) {
                return 0;
            } else if(b % res == 0) {
                return res;
            } else {
                a = b;
                b = res;
            }

        }
    }

}
