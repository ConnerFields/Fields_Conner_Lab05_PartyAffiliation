//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //create scanner
        String partyAffil = ""; //create our string
        System.out.println("Please choose your political affiliation (R)(D)(I) *This is case sensitive");

        if(in.hasNext()); //getting input from user
        {
           partyAffil = in.next();
        }
        if(partyAffil.equals("R"))
        {
            System.out.println("You're a Republican Elephant");
        }
        else if(partyAffil.equals("D"))
        {
            System.out.println("You're a Democrat Donkey");
        }
        else if(partyAffil.equals("I"))
        {
            System.out.println("You're an Independent Human");
        }
        else
        {
            System.out.println("You chose other");
        }
    }
}