package com.strcalk;

import static com.strcalk.Main.*;

public class Calculated {
    static int res;
    static String s4;
    static int g;

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
                if(s0.contains("\"")&& s2.contains("\""))
                s4 = s0 + s2;
                else
                    throw new Exception("не верная операция");
                break;
            case '-':
                if(s0.contains("\"")&& s2.contains("\""))
                s4 = s0.replace(s2, "");
                else
                    throw new Exception("не верная операция");

                break;
            case '*':
                if(num2==0)
                    throw new Exception("не верная операция");
                else {
                    if(s0.contains("\""))
                    s4 = s0.repeat(num2);
                    else
                        throw new Exception("не верная операция");

                }
                break;
            case '/':
                if(num2==0)
                        throw new Exception("не верная операция");
                     else {
                    if(s0.contains("\"")) {
                        g = s0.length() / num2;
                        s4 = s0.substring(0, g);
                    }
                    else
                        throw new Exception("не верная операция");
                }
        }


    }

}