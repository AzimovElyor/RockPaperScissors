import java.util.Random;
import java.util.Scanner;

public class Main {
   public static int winNumber = 0;
    public static int loseNumber = 0;
    public static int drawNumber = 0;
    public static  final String WIN_MESSAGE = "You win!";
    public static final String LOST_MESSAGE  = "You lost!";
    public static final String DRAW_MESSAGE = "DRAW";
    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String END = "tugash";
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random(); // random qiymalar generatsiya qilib berish uchun
        String myChoice = "";
        String result = "";
do{
    myChoice = getMyChoice(scanner1);  // get my choice
    if(myChoice.equals(END)) break;

    String computerChoice = getComputerChoice(random);  //  computerchoice

    if(myChoice.equals(PAPER) || myChoice.equals(ROCK) || myChoice.equals(SCISSORS)) {
        result = switch (myChoice) {
            case ROCK -> casesForRock(computerChoice);
            case PAPER -> casesForPaper(computerChoice);
            case SCISSORS -> casesForScissors(computerChoice);
            default -> result;
        };

        System.out.println("Your choie is " + myChoice + " and the computer choice is " + computerChoice + " and the result is " + result);
    }else{
        System.out.println("Invalid my choice");
        printResult();
    }

}while(true);

        System.out.println("The game ends ");



    }
    public static String getMyChoice(Scanner scanner){
        System.out.print(" Enter only rock, paper, or scissors, tugash ==> ");
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

}