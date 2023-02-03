import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Please enter your birth year: ");
        year = input.nextInt();

        if (year >= 1900){
            if (year % 12 == 0){
                System.out.print("Your Chinese Zodiac Sign is: " + "Monkey");
            }
            else if (year % 12 == 1){
                System.out.print("Your Chinese Zodiac Sign is: " + "Cock");
            }
            else if (year % 12 == 2){
                System.out.print("Your Chinese Zodiac Sign is: " + "Dog");
            }
            else if (year % 12 == 3){
                System.out.print("Your Chinese Zodiac Sign is: " + "Pig");
            }
            else if (year % 12 == 4){
                System.out.print("Your Chinese Zodiac Sign is: " + "Mouse");
            }
            else if (year % 12 == 5){
                System.out.print("Your Chinese Zodiac Sign is: " + "Ox");
            }
            else if (year % 12 == 6){
                System.out.print("Your Chinese Zodiac Sign is: " + "Tiger");
            }
            else if (year % 12 == 7){
                System.out.print("Your Chinese Zodiac Sign is: " + "Rabbit");
            }
            else if (year % 12 == 8){
                System.out.print("Your Chinese Zodiac Sign is: " + "Dragon");
            }
            else if (year % 12 == 9){
                System.out.print("Your Chinese Zodiac Sign is: " + "Snake");
            }
            else if (year % 12 == 10){
                System.out.print("Your Chinese Zodiac Sign is: " + "Horse");
            }
            else
                System.out.print("Your Chinese Zodiac Sign is: " + "Sheep");
            }
        else
            System.out.print("Birth year must greater than 1900. \nPlease restart the program.");

            }
        }


