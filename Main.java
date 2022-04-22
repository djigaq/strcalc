package com.strcalk;

import java.util.Scanner;

import static com.strcalk.Calculated.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int num1, num2;
    static char op;
    static String s0;
    static String s2;


    public static void main(String[] args) throws Exception {
        String u = scan.nextLine();
        char[] pr = new char[21];
        for (int i = 0; i < u.length(); i++) {
            pr[i] = u.charAt(i);
            if (pr[i] == '+') {
                op = '+';
            }
            if (pr[i] == '-') {
                op = '-';
            }
            if (pr[i] == '*') {
                op = '*';
            }
            if (pr[i] == '/') {
                op = '/';
            }
        }
        String prString = String.valueOf(pr);
        String[] blacks = prString.split("[+-/*]");

            s0 = blacks[0];
            String s1 = blacks[1];
            s2 = s1.trim();


        try {
            num1 = Integer.parseInt(s0);
        } catch (NumberFormatException e) {
        }
        try {
            num2 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
        }
        if (num1>0 && num2>0 && num1 <= 10 && num2 <= 10) {
            calculated(num1, num2, op);
            System.out.println(num1+op+num2+"="+res);
        } else {
            if(num1>1&&num1<10)
                throw new Exception("не верная  операция");
            else
            сalc();
            String s5 = s4.replace("\"", "");
            if (s4.length()>40)
                System.out.println("\""+s5+"\""+"...");
            else
                System.out.println("\""+s5+"\"");

        }

    }


}

