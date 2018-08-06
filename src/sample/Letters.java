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
        //System.out.println(result);
        return result;
    }
    public static String space(int length){
        String alphabet =
                new String("AB CD EF GHIJK LMN OP QRSTU VWXYZabcdefghijklmnopqrstuvwxyz0123456789");
        int n = alphabet.length();

        String result = new String();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(i);
       // System.out.println(result);
        return result;
    }
    public static String upperCase(int length){
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int n = alphabet.length();

        String result = new String();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(i);
        // System.out.println(result);
        return result;
    }

    public static String upperCaseRandom(int length){
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int n = alphabet.length();

        String result = new String();
        Random r = new Random();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        // System.out.println(result);
        return result;
    }

    public static String random(int length){
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
        int n = alphabet.length();

        String result = new String();
        Random r = new Random();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        //System.out.println(result);
        return result;
    }

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


    public static String symbolWithSpacesOnlyLetters(int length){
        String alphabet =
                new String(" A B C D E F G H I JKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ");
        int n = alphabet.length();

        String result = new String();
        Random r = new Random();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        //System.out.println(result);
        return result;
    }


    public static String upperCaseRandomSpace(int length){
        String alphabet =
                new String(" A B C D E F G H I JKLMNOPQRSTUVWXYZ");
        int n = alphabet.length();

        String result = new String();
        Random r = new Random();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(r.nextInt(n));
        //System.out.println(result);
        return result;
    }

    public static String upperCaseSpace(int length){
        String alphabet =
                new String(" A B C D E F G H I JKLMNOPQRSTUVWXYZ");
        int n = alphabet.length();

        String result = new String();

        for (int i=0; i<length; i++)
            result = result + alphabet.charAt(i);
        //System.out.println(result);
        return result;
    }

}
