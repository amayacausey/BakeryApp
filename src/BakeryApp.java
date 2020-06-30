import java.util.Scanner;

public class BakeryApp{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BakeryDatabase sweetTreats = new BakeryDatabase();

        sweetTreats.preloadDB();

        System.out.println("What are you allergic to? To see all options insert all!");
        String userAllergy = input.nextLine();
        System.out.println(sweetTreats.searchByAllergy(userAllergy));

        //sweetTreats.searchByAllergy(userAllergy);
    }}