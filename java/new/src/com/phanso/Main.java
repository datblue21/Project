package com.phanso;

import java.util.Scanner;

public class Main {
    int i = 10;
    Scanner input = new Scanner(System.in);
    int j = -1;
    try{
        j = input.nextInt();
    } catch(ArithmeticException e)
    {
        System.out.println("Problem");
    }
    switch(j){
        case -1:
            break;
    }
}
