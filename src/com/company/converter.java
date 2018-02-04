package com.company;

import java.util.Arrays;

/**
 * Created by el693 (who is super cool and awesome) on 2/2/18.
 */
public class converter {
    public String RGB = "";
    public String[] hex = new String[3];

    public converter(String color){
        if (color.contains(",")) {
           RGB =
            for (int x = 0;x < 3;x++){
                hex[x] = convertToHex(RGB[x]);
            }
        }
        else {
            hex[0] = color.substring(0,2);
            hex[1] = color.substring(2,4);
            hex[2] = color.substring(4,6);
            for (int x = 0;x < 3;x++){
                RGB[x] = convertToRGB(hex[x]);
            }
        }
    }

    public String convertToHex(String x){
        String[] colorValuesString = x.split("");
        int[] values = new int[3];
        for(int i =0; i<3; i++) {
            values[i] = Integer.parseInt(colorValuesString[i]);
        }
        StringBuilder maker = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            int temp = values[i];

            int numOne = temp/16;
            String numOneHex = Integer.toString(numOne, 16);
            int numTwo = (temp % 16);
            String numTwoHex = Integer.toString(numTwo, 16);

            maker.append(numOneHex);
            maker.append(numTwoHex);
        }
        return maker.toString();
    }
    public String convertToRGB(String x){
        return Integer.toString(Integer.parseInt(x.substring(0,1),16)*16 + Integer.parseInt(x.substring(1),16));

    }
    public String getHex() {
        return Arrays.toString(hex);
    }

    public String getRGB() {
        return Arrays.toString(RGB);
    }

}
