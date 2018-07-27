package sample;

public class Emails {

    public static String correctEmail(){
        String [] cards = new String[7];
        cards[0] = "cathzajic@hotmail.com";
        cards[1] = "bat@yandex.ru";
        cards[2] = "A-Za-z0-9.164@gmail.com";
        cards[3] = "email@domain.web";
        cards[4] = "kepam@gmail.com";
        cards[5] = "user.amex@ukr.net";
        cards[6] = "stephany333@msn.com";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String popularDomain(){
        String [] cards = new String[7];
        cards[0] = "@gmail.com";
        cards[1] = "@yahoo.com";
        cards[2] = "@aol.com";
        cards[3] = "@msn.com";
        cards[4] = "@hotmail.com";
        cards[5] = "@yandex.ru";
        cards[6] = "@ukr.net";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String incorrectEmail(){
        String [] cards = new String[8];
        cards[0] = "email.@domain.com";
        cards[1] = ".email.@domain.com";
        cards[2] = "email..@domain.com";
        cards[3] = "email@domain..com";
        cards[4] = "email@.domain.com";
        cards[5] = "qwe!!!@google.com";
        cards[6] = "12345@google.com";
        cards[7] = "([A-Za-z0-9& _%+-]{1,64}@[A-Za.gmail.com";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String numbersInEmail(){
        String [] cards = new String[7];
        cards[0] = "a0123456789@gmail.com";
        cards[1] = "a.12@yahoo.com";
        cards[2] = "a-123@aol.com";
        cards[3] = "a-1234@msn.com";
        cards[4] = "a_12345@hotmail.com";
        cards[5] = "a.1-23456@yandex.ru";
        cards[6] = "a_13456782@ukr.net";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String sameaccount(){
        String [] cards = new String[7];
        cards[0] = "QAuser@gmail.com";
        cards[1] = "qauser@gmail.com";
        cards[2] = "a-123@aol.com";
        cards[3] = "a-1234@msn.com";
        cards[4] = "a_12345@hotmail.com";
        cards[5] = "a.1-23456@yandex.ru";
        cards[6] = "a_13456782@ukr.net";

        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

    public static String specialmail(){
        String [] cards = new String[2];
        cards[0] = "a64symbols_part.qrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijkl@gmail.com";
        cards[1] = "s255symbols_part.rstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirstfirst12345@gmail.com";
        int m = cards.length;
        int n = (int) (Math.random()*m);
        return (cards[n]);
    }

}
