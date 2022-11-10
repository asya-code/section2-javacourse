import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! ");

        int counter = 0;
        System.out.println("What is your name ");
        String name = scan.nextLine();
        counter ++;

        System.out.println("How old are you? ");
        int age = scan.nextInt();
        counter ++;

        System.out.println("How mush can you spend on coffee?");
        double coffeeAmount = scan.nextDouble();
        counter ++;

        System.out.println("How mush can you spend on fastfood?");
        double foodAmount = scan.nextDouble();
        counter ++;

        scan.close();
        System.out.println("\nThank you, " + name + " for answering these " + counter + " questions!");
        System.out.println("Your fastfood expenses are " + (int)(foodAmount / coffeeAmount) + " times more than coffee expenses");

    }
}
