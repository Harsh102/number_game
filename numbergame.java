package task3;

import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int randomnuber=1+(int) (100*Math.random());
        int n=5,i;
        System.out.println("Guess the number with in 5 trial's");
        for( i=0;i<n;i++) {
            System.out.println("User's guessed number");
            int user = sc.nextInt();
            if (randomnuber == user) {
                System.out.println("user guessed a number is correct");
                break;
            } else if (randomnuber > user )
                System.out.println("The number is greater then" + user);
            else if (randomnuber < user )
                System.out.println("The number is less then" + user);
            }
        System.out.println("The number was:"+randomnuber);
    }
}
