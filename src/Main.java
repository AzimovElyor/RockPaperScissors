import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
   public static int winNumber = 0;
    public static int loseNumber = 0;
    public static int drawNumber = 0;
    public static int theNumberOfMoves = 0;
    public static String[] myMoves = new String[100];
    public static String[] computerMoves = new String[100];
    public static String[] results = new String[100];
    public static  final String WIN_MESSAGE = "You win!";
    public static final String LOST_MESSAGE  = "You lost!";
    public static final String DRAW_MESSAGE = "DRAW";
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String EXIT_GAME = "chiqish";
    public static void main(String[] args) {
        // String[] names = new String.length
      //  System.out.println("Arrays.toString(myMoves) = " + Arrays.toString(myMoves));
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();

            mainMenu(scanner1, random);


        System.out.println("The game ends ");

    }

    public static void gameMenu(Scanner scanner, Random random) {
        String myChoice = "";
        String result = "";
        do{
            myChoice = getMyChoice(scanner);  // get my choice
            if(myChoice.equals(EXIT_GAME)) return;

            String computerChoice = getComputerChoice(random);  //  computerchoice

            if(myChoice.equals(PAPER) || myChoice.equals(ROCK) || myChoice.equals(SCISSORS)) {
                result = switch (myChoice) {
                    case ROCK -> casesForRock(computerChoice);
                    case PAPER -> casesForPaper(computerChoice);
                    case SCISSORS -> casesForScissors(computerChoice);
                    default -> result;
                };

                System.out.println("Your choie is " + myChoice + " and the computer choice is " + computerChoice + " and the result is " + result);
                myMoves[theNumberOfMoves] = myChoice;
                computerMoves[theNumberOfMoves] = computerChoice;
                results[theNumberOfMoves] = result;
                theNumberOfMoves++; //1
            }else{
                System.out.println("Invalid my choice");
                printResult();
            }

        }while(true);
    }
    public static String getMyChoice(Scanner scanner){
        System.out.print(" Enter only rock, paper, or scissors, chiqish ==> ");
        return scanner.next();
    }
    public static String getComputerChoice(Random random){
        int randomNumber = random.nextInt(0, 3);

        return switch (randomNumber){
            case 0 -> ROCK;  // rock
            case 1 -> PAPER; // paper
            case 2 -> SCISSORS;
            default-> "Invalid generated value";
        };
    }
    public static String casesForRock(String computerChoice){
        if (computerChoice.equals(SCISSORS)) {
            winNumber++;
            return   WIN_MESSAGE;
        } else if (computerChoice.equals(PAPER)) {
            loseNumber++;
            return LOST_MESSAGE;
        } else {
            drawNumber++;
            return  DRAW_MESSAGE;
        }
    }
    public static String casesForPaper(String computerChoice){
        if (computerChoice.equals(ROCK)) {
            winNumber++;
            return  WIN_MESSAGE;

        } else if (computerChoice.equals(SCISSORS)) {
            loseNumber++;
            return  LOST_MESSAGE;
        } else {
            drawNumber++;
             return  DRAW_MESSAGE;
        }
    }
    public static String casesForScissors(String computerChoice){
        if (computerChoice.equals(PAPER)) {
            winNumber++;
            return WIN_MESSAGE;
        } else if (computerChoice.equals(ROCK)) {
            loseNumber++;
            return LOST_MESSAGE;
        } else {
            drawNumber++;
            return  DRAW_MESSAGE;
        }
    }
    public static void printResult(){
        System.out.println("Win Number = " + winNumber + " and Loss Number = " + loseNumber + " and Draw Number = " + drawNumber);
    }
    public static void history(){
        if(theNumberOfMoves == 0){
            System.out.println("==============================================================");
            System.out.println("=================    There is no history   ===================");
            System.out.println("==============================================================");

        }
     else for(int i = 0; i < theNumberOfMoves; i++){
       System.out.println(i + 1 + " ) " + myMoves[i] + " --- " + computerMoves[i] + " --- " + results[i]);
   }
    }
    public static void mainMenu(Scanner scanner, Random random){
        boolean isExists = false;
        do{
        System.out.println("------------------      ROCK PAPER SCISSORS GAME  -------------------");
        System.out.println("PLAY THE GAME (Enter P)");
        System.out.println("HISTORY (ENTER H )");
        System.out.println("Exit (ENTER E )");
        System.out.print("Please choice one of them --> ");
        String menuChoice =  scanner.nextLine();
        switch (menuChoice){
            case "P":   gameMenu(scanner,random); break;
            case "H":  history(); break;
            case "E":  isExists = true; break;
            default : System.out.println("Invalid menu choice. Try again.");
        }}while (!isExists);
    }

}