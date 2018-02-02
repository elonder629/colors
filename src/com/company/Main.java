package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter either an RGB Triplet or Hex value");
        Scanner value = new Scanner(input.next());
        int[] threeValues = new int[3];
        if (value.next().contains(",")){
            value.useDelimiter(",");
            for (int x = 0; x < 3; x++){
                threeValues[x] = value.nextInt();
                System.out.println(threeValues[x]);
            }
        }
    }
}
