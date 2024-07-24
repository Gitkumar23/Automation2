package JavaBasics;

public class Programsonloops {
    public static void main(String[] args) {


        int m = 1200;
        int rev = 0;

        while (m > 0) {
            int rem = m % 10;
            rev = (rev * 10) + rem;
            m = m / 10;
        }
        System.out.println(rev);
    }
}

