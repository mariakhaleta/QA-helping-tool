package sample;

import java.util.Random;

public class Letters {
    public static String generateSymbol(int length){
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
        int n = alphabet.length();

        String result = new String();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(i);
        System.out.println(result);
        return result;
    }
}
