// write a short program that prints each number from 1 to 100 on a new line
// for each multiple of 3 , print "fizz" instead of the number
// for each multiple of 5 , print "buzz" instead of the number
// for numbers which are multiples of both 3 and 5, print "fizzbuzz" instead of the number
public class Main {
    public static void main(String[] args) {

        for (int i =1; i<=100; i++){
            if (i%3==0 && i%5==0) {
                System.out.print( "fizzbuzz ");
            } else if (i%5==0) {
                System.out.print( "buzz ");

            } else if (i%3==0) {
                System.out.print( "fizz ");
            }else {
                System.out.print(i+ " ");
            }
        }










    }
}