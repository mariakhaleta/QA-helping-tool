package sample;

import java.util.Arrays;

public class PhoneAndCards {
    public static String ukPhone(){
        String [] cards = new String[7];
        cards[0] = "+442071234567";
        cards[1] = "+443069990362";
        cards[2] = "+443069990207";
        cards[3] = "+443069990364";
        cards[4] = "+443069990615";
        cards[5] = "+443069990508";
        cards[6] = "+443069990274";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String canadaPhone(){
        String [] cards = new String[6];
        cards[0] = "+14165550155";
        cards[1] = "+14165550176";
        cards[2] = "+14165550168";
        cards[3] = "+14165550137";
        cards[4] = "+14165550192";
        cards[5] = "+14165550133";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String germanPhone(){
        String [] cards = new String[7];
        cards[0] = "+4915773755222";
        cards[1] = "+49-162-2729-215";
        cards[2] = "+4915773766333";
        cards[3] = "(0162) 272 9215";
        cards[4] = "0162 272 9215";
        cards[5] = "754-3010";
        cards[6] = "7543010";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String usaPhone(){
        String [] cards = new String[6];
        cards[0] = "+442071345673";
        cards[1] = "+442067895654";
        cards[2] = "+442045678976";
        cards[3] = "+442012345678";
        cards[4] = "+442023456789";
        cards[5] = "+442034567890";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String visaCard(){
        String [] cards = new String[5];
        cards[0] = "4532829125709692";
        cards[1] = "41952 36239 00308 7";
        cards[2] = "4539-4756-6116-5700";
        cards[3] = "4539 5870 0929 0931";
        cards[4] = "4024.0071.6419.721";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String masterCard(){
        String [] cards = new String[5];
        cards[0] = "5391802247989200";
        cards[1] = "55733 73240 51684 6";
        cards[2] = "5275-7926-6423-6492";
        cards[3] = "5146 3180 4332 1355";
        cards[4] = "5453.7985.2721.9612";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String discoverCard(){
        String [] cards = new String[5];
        cards[0] = "6011240316338058";
        cards[1] = "60116 14918 17430 3";
        cards[2] = "6011-7104-3291-4420";
        cards[3] = "6011 1114 9905 7460";
        cards[4] = "6011.5308.2723.3875";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String amExpressCard(){
        String [] cards = new String[5];
        cards[0] = "371449635398431";
        cards[1] = "37343 34343 34343 3";
        cards[2] = "3711-4437-1144-4420";
        cards[3] = "3700 0000 0000 7460";
        cards[4] = "3712.3454.7895.0004";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }
}
