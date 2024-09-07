/* Creating a class Game, which allows a user to play "Guess the Number" game once.
       Game will have the following methods:
       1. Constructor to generate the random number
       2. takeUserInput() to take a user input of number
       3. isCorrectNumber() to detect whether the number entered by user is true
       4. getters and setter for noOfGuessers
       Use properties such as noOfGuesses(int), etc to get this task done!
        */
import java.util.Random;
import java.util.Scanner;

class guessNumber{
    public int number ;
    public int inputNumber;
    public int getNoOfGuesses;

    public int getGetNoOfGuesses() {
        return getNoOfGuesses;
    }

    public void setGetNoOfGuesses(int getNoOfGuesses) {
        this.getNoOfGuesses = getNoOfGuesses;
    }
    guessNumber(){
        Random rand = new Random();
       this.number = rand.nextInt(100);
   }
    void takeUserInput(){
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
       inputNumber = sc.nextInt();

    }
    boolean isCorrectNumber() {
        if(inputNumber==number){
            System.out.format("yes u guessed it right %d\n",inputNumber);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too less..");
        }
        else if(inputNumber>number){
            System.out.println("too high");
        }
        return false;
    }
}
public class CWH_43_Guess_the_number {
    public static void main(String[] args) {
    guessNumber g = new guessNumber();
    boolean b = false;
    while(!b){
    g.takeUserInput();
    b = g.isCorrectNumber();
        System.out.println(b);
    }
    }
}
