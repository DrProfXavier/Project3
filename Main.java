import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner oak = new Scanner(System.in);
        System.out.println("Welcome to your PokeDex!");
        System.out.println("How many pokemon are in your region?\n");
        int population = oak.nextInt();

        System.out.println("Your new Pokedex can hold " + population + " Pokemon. Let's start using it!");
        System.out.println("1. List Pokemon");
        System.out.println("2. Add Pokemon");
        System.out.println("3. Check a Pokemon’s Stats");
        System.out.println("4. Evolve Pokemon");
        System.out.println("5. Sort Pokemon");
        System.out.println("6. Exit");

        System.out.println("What would you like to do?");
        int userChoice = oak.nextInt();
        switch (userChoice)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;

        }


    }
}
