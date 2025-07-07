import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world1");

        // Rock , paper, scissors  ekrandan olib olamiz  +++

        // computer tanlagan tanlovini  ===> 0 ==> rock,  1 ==> paper, 2 ==> scissors +++

        // tanlagan tanlomizni aniqlashtirib oldik  +++

        // biz tanlagan tanlovlardan computerniki solishtirish

        // result ==> You win! You lose! Draw

        // rock >  scissors , rock < paper , rock == rock +++

        // paper > rock, paper < scissors, paper == paper +++

        // scissors > paper, scissors < rock, scissors == scissors +++

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // random qiymalar generatsiya qilib berish uchun
        System.out.print(" Enter only rock, paper, or scissors ==> ");
        String myChoice = scanner.nextLine();
        String result = "";

        String computerChoice = "";
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
                    } else if (computerChoice.equals("paper")) {
                        result = "You lost!";
                    } else {
                        result = "Draw";
                    }
                }
                break;
                case "paper": {
                    if (computerChoice.equals("rock")) {
                        result = "You win!";
                    } else if (computerChoice.equals("scissors")) {
                        result = "You lost!";
                    } else {
                        result = "Draw";
                    }

                }
                break;
                case "scissors": {
                    if (computerChoice.equals("paper")) {
                        result = "You win!";
                    } else if (computerChoice.equals("rock")) {
                        result = "You lost!";
                    } else {
                        result = "Draw";
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




    }
}