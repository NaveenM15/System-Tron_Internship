import java.util.Scanner;
import java.util.Random;

public class GUESS_A_NUMBER_GAME {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            Random rand=new Random();
            int randnum=rand.nextInt(100);
            int guess=-1;
            int tries=0;
            while(guess!=randnum)
            {
                System.out.print("Guess a number between 1 and 100: ");
                guess=in.nextInt();
                tries++;

                if(guess==randnum){
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("****Awesome! You Guessed the Number!****");
                    System.out.println("It only took you "+ tries +" guess!");
                    System.out.println("would you like to play again? Yes or No: ");
                    play=in.next().toLowerCase();
                }
                else if(guess> randnum)
                {
                    System.out.println("Your guess is too High, try again.");
                }
                else
                {
                    System.out.println("Your guess is too Low, try again.");
                }
            }
        }

    }
}
