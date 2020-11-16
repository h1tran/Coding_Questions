// package whatever; // don't place package name!

import java.io.*;
import java.util.ArrayList;

// Current implementation has a runtime of 2.19s
// Better to use hashmaps

class MyCode {
    public static void main(String[] args) {
        MyCode codeInstance = new MyCode();
        ArrayList<Integer> test = codeInstance.capitals("CodEWaRs");
        for (Integer number : test) {
            System.out.println(number);
        }
    }

    // isUpperCase - 2.03s
    // ASCII comparison with character values - 1.94s

    public ArrayList<Integer> capitals(String text) {
        int value;
        ArrayList<Integer> indexList = new ArrayList<>();
        if (text != null)
            for (int i = 0; i < text.length(); i++) {
                value = text.charAt(i);
                if (value < 90 && value > 65)
                    indexList.add(i);
            }
        return indexList;
    }
}