package sample;

import java.util.Arrays;
import java.util.Random;

public class TextGenerate {

    public String numbers(){
        int[] numbers = new int[15];
        for (int i =0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        String n;
        n = TextGenerate.toString(numbers);
        return n;
    }

    public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.toString();
        }
    }

    public static void main(String[] args) {

    }

    public static String generateSessionKey(int length){
        String alphabet =
                new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
    public static String generateSymbol(int length){
        String alphabet =
                new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
    public static String wildSymbol(){
        String alphabet =
                new String("-:;'\'></"); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<alphabet.length(); i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
    public static String symbolWithSpaces(int length){
        String alphabet =
                new String(" A B C D E F G H I JKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
    public static String generateNumbers(int length){
        String alphabet =
                new String("0123456789"); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
    public static String generateNumbersWithSpaces(int length){
        String alphabet =
                new String(" 0 1 2 3 4 5 6 7 8 9 "); //9
        int n = alphabet.length(); //10

        String result = new String();
        Random r = new Random(); //11

        for (int i=0; i<length; i++) //12
            result = result + alphabet.charAt(r.nextInt(n)); //13
        System.out.println(result);
        return result;
    }
}
