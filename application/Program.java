package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion championOne,championTwo;

        System.out.println();
        System.out.println("Enter the data of the first champion: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Early life: ");
        int life = sc.nextInt();

        System.out.print("Attack: ");
        int attack = sc.nextInt();

        System.out.print("Armour: ");
        int armour = sc.nextInt();

        championOne = new Champion(name,life,attack,armour);

        System.out.println();
        System.out.println("Enter the data of the second champion: ");
        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();

        System.out.print("Early life: ");
        life = sc.nextInt();

        System.out.print("Attack: ");
        attack = sc.nextInt();

        System.out.print("Armour: ");
        armour = sc.nextInt();

        championTwo = new Champion(name,life,attack,armour);

        System.out.println();
        System.out.print("How many shifts do you want to run: ");
        int response = sc.nextInt();

        for (int i = 1; i<=response; i++) {
            System.out.println();
            System.out.println("Shift result " + i + ":");
            championOne.takeDamage(championTwo);
            championTwo.takeDamage(championOne);
            System.out.println(championOne.status());
            System.out.println(championTwo.status());
            if (championOne.getLife() == 0 || championTwo.getLife() == 0) {
                i = response;
            }
        }

        System.out.println();
        System.out.println("END OF COMBAT");




    }
}
