package java;

public class DicePairRoller {

    public static void main(String[]args){
        int die1Score;
        int die2Score;
        int diceTotal;

        die1Score = (int)(Math.random()*6) + 1;
        die2Score = (int)(Math.random()*6) + 1;
        diceTotal = die1Score+die2Score;

        System.out.print("The first die roll was ");
        System.out.println(die1Score);
        System.out.print("The second die roll was ");
        System.out.println(die2Score);
        System.out.print("The total was ");
        System.out.println(diceTotal);
    }
}
