package bodz.dmytro.practics.javarush;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose between : 1 or 2 =>");
        int fateInYourArms = Integer.parseInt(scanner.nextLine());


        if(fateInYourArms == 1){
        System.out.println("Hello World!");}
        if(fateInYourArms ==2) {
            System.out.println("You have 7 days left");
        }
    }
}
