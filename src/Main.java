import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world1");
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random(); // random qiymalar generatsiya qilib berish uchun
        int winNumber = 0;
        int lossNumber = 0;
        int drawNumber = 0;
        String myChoice = "";
        String result = "";
do{
    System.out.print(" Enter only rock, paper, or scissors, tugash ==> ");
    myChoice = scanner1.next();
    String computerChoice;
    int randomNumber = random.nextInt(0, 3);

    computerChoice = switch (randomNumber){
        case 0 -> "rock";  // rock
        case 1 -> "paper"; // paper
        case 2 -> "scissors";
        default-> "Invalid generated value";
    };


/*        System.out.println("myChoice = " + myChoice);
        System.out.println("computerChoice = " + computerChoice);*/
    System.out.println("randomNumber = " + randomNumber);
   /*     switch(randomNumber){
            case 0: computerChoice = "rock"; break;
            case 1: computerChoice = "paper"; break;
            case 2: computerChoice = "scissors"; break;
            default:
                System.out.println("Invalid generated number");
        }*/
    // if else

/*        if(myChoice.equals("rock")){

        }else if(myChoice.equals("paper")){

        }else{

        }*/
    // switch
    if(myChoice.equals("paper") || myChoice.equals("rock") ||myChoice.equals("scissors")) {
        switch (myChoice) {
            case "rock": {  // rock > computerchoice = scissors, rock < computerChoise = paper , rock = rock
                if (computerChoice.equals("scissors")) {
                    result = "You win!";
                    winNumber++;
                } else if (computerChoice.equals("paper")) {
                    result = "You lost!";
                    lossNumber++;
                } else {
                    result = "Draw";
                    drawNumber++;
                }
            }
            break;
            case "paper": {
                if (computerChoice.equals("rock")) {
                    result = "You win!";
                    winNumber++;
                } else if (computerChoice.equals("scissors")) {
                    result = "You lost!";
                    lossNumber++;
                } else {
                    result = "Draw";
                    drawNumber++;
                }

            }
            break;
            case "scissors": {
                if (computerChoice.equals("paper")) {
                    result = "You win!";
                    winNumber++;
                } else if (computerChoice.equals("rock")) {
                    result = "You lost!";
                    lossNumber++;
                } else {
                    result = "Draw";
                    drawNumber++;
                }
            }
            break;
            default:
                System.out.println("Invalid choice");

        }

        System.out.println("Your choie is " + myChoice + " and the computer choice is " + computerChoice + " and the result is " + result);
    }else{
        System.out.println("Invalid my choice");
    }
    System.out.println("Win Number = " + winNumber + " and Loss Number = " + lossNumber + " and Draw Number = " + drawNumber);


}while(!myChoice.equals("tugash")); // tugash == tugash

        System.out.println("The game ends");



    }
}