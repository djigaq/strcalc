package com.strcalk;

import static com.strcalk.Main.*;

public class Calculated {
    static int res;
    static String s4;

    public static void calculated(int num1, int num2, char op) throws Exception {
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                if (num1 == 0 || num2 == 0)
                    throw new Exception("не верная операция");

                else
                    res = num1 / num2;

        }

    }

    public static void сalc() throws Exception {
        switch (op) {
            case '+':
                s4 = s0 + s2;
                break;
            case '-':
                s4 = s0.replace(s2, "");

                break;
            case '*':
                if(num2==0)
                    throw new Exception("не верная операция");
                else {
                    s4 = s0.repeat(num2);

                }
                break;
            case '/':
                if(num2==0)
                        throw new Exception("не верная операция");
                     else {
                    int s = s0.length() / num2;
                    s4 = s0.substring(0, s);
                }
        }


    }

}