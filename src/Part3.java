import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        System.out.println("Hello what is your name?");
        Scanner in =  new  Scanner(System.in);
        String Name = in.nextLine();
        System.out.println("Hello " + Name);

        System.out.println("How old are you?");

        int Age = in.nextInt();
        in.nextLine();
        if (Age >= 13 &&  Age <= 16){
            System.out.println("You can read: Book1 or Book2   " );
        } else if (Age >= 18) {
            System.out.println("Your choice is Book 3 or 5");
        }
        else if (Age <= 13){
            System.out.println("You can read Book 6 or 7");
        }
        else if (Age == 17){
            System.out.println("Your choice is 0");
        }

    }

}
