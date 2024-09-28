import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String userParty;
        System.out.print("What is your political party affiliation? Enter D, R, or I: ");
        userParty = in.nextLine();
        switch(userParty)
        {
            case "D":
            case "d":
                System.out.print("You get a Democratic Donkey.");
                break;
            case "R":
            case "r":
                System.out.print("You get a Republican Elephant.");
                break;
            case "I":
            case "i":
                System.out.print("You get an Independent Person.");
                break;
            default:
                System.out.print("Your political party is utterly incomprehensible to this program.");





        }
    }
}