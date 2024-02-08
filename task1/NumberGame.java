//Number Game using java code!!
import java.util.Scanner;
public class NumberGame{
    public int getRandN(int min,int max){
        return (int)(Math.random()*(max-min+2)-min);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberGame p =new NumberGame();
        int chances=10;
        int finals=0;
        boolean PlayAgain=true;
        System.out.println("Hello! Welcome to the number game...");
        System.out.println("Hey You have only "+chances+" chances to win the game!");
        while(PlayAgain){
            int rand=p.getRandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance "+(i+1)+ " Guess the number:");
                int user=s.nextInt();
                finals=i+1;
                if(user==rand){
                    guess=true;
                    System.out.println("you predicted correct!");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High !");
                }
                else{
                    System.out.println("Too Low !");
                }
            }
            if(guess==false){
                System.out.println("Oops! You have lost all your chances.");
            }
            System.out.println("Your Scaore is :"+(11-finals));
            System.out.println("Do you want to play again??(Enter y for Yes/n for No)");
            String t=s.next();
            PlayAgain=t.equalsIgnoreCase("y");
        }
    }
}