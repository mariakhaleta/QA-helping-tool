package sample;

import java.util.Random;

import static java.lang.String.valueOf;

public class textGenerate {

    static final int LETTERS_COUNT = 'z'-'a'+1;

    public String[] letters15(){
        String[] randomChars = new String[15];
        Random r = new Random();

        for(int i=0; i<randomChars.length; i++) {
            randomChars[i] = valueOf((r.nextInt(LETTERS_COUNT) + (r.nextBoolean() ? 'a' : 'A')));
        }
        return randomChars;
    }

    public static void main(String[] args) {
        char[] array = new char[8];
        int rand;
        Random r = new Random();
        for (int i = 0; i< 8; i++) {
            rand = r.nextInt(127); //тут менять нужные диапазоны ((max - min) + 1) + min (см ASCII)
            array[i] = (char)rand;
        }
        for(char c : array)
            System.out.println(c);
    }

}
