package sample;

import java.util.Random;

public class Numbers {

    public static String symbolWithSpaces(int length){
        String alphabet =
                new String(" A B C D E F G H I JKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 0123456789");
        int n = alphabet.length();

        String result = new String();
        Random r = new Random();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        //System.out.println(result);
        return result;
    }
}
