package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Please enter two integers in the format \"number1,number2\"");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        String [] options = ans.split(",");
        int x = Integer.parseInt(options[0]);
        int y = Integer.parseInt(options[1]);

        //Recursive:
        gcdR(x,y);

        //Iterative:
        gcdI(x,y);


    }

    public static int gcdR(int a, int b)
    {
        if (a == 0)
        {
            return a;
        }
        else
        {
            return gcdR(b, a%b);
        }
    }
    public static int gcdI(int a, int b)
    {
        while (b != 0)
        {
            int c = b;
            b = a%b;
            a = c;
        }
        return a;
    }

}
