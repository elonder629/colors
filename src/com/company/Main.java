package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter either an RGB Triplet or Hex value");
        converter converter = new converter(input.nextLine());
        System.out.println("RGB: " + converter.getRGB() + "HEX: " + converter.getHex());
    }
}
