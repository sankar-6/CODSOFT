import java.util.*;
import java.util.Random;
 /**
  * NumberGameProject
  */
 public class NumberGameProject {
    public static void main(String[] args) {
        System.out.println("Hi! Welcome To The Number Game");
        Scanner in = new Scanner(System.in);
        Random random=new Random();
        int random_input=random.nextInt(0,100)+1;
        boolean play_again =true;
        int score=0;
        
        int rounds=1;
        while(play_again){
            System.out.println("Note:You have 10 rounds to find the number.");
            boolean count = false;
            System.out.println("Round \'"+rounds+"\'");
            int chance=1;
            for(int i=0;i<10;i++){
                
                System.out.println("Enter -->"+chance+"<-- Round:");
                int input=in.nextInt();
                chance ++;
                if(input==random_input){
                    if(score==0){
                        count=true;
                        score +=5;
                    }
                    else{
                        score *=5;
                    }
                    System.out.println("Congratulations");
                    System.out.println("You Entered The Correct Number.");
                    break;
                }
                else if(input>random_input){
                    System.out.println("Your Number is Greater Than the Finding Number.");
                }
                else{
                    System.out.println("Your Number is Less Than The Finding Number.");
                }
                
                 
            }
                if(count==false){
                System.out.println("Sorry !It looks Like You are not Find The Given Number.The correct Number is "+random_input);
        }
            rounds++;
            System.out.println("Do You Want To Play Again({1}for Yes)/({0} for No)");
            String again=in.next();
            play_again = again.equals("1");
        }
        System.out.println("Game Over!");
        System.out.println("Your Score is "+score);
        in.close();
}
    
 }
