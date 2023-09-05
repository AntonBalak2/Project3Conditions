import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Age = in.nextInt();
if (Age <= 7){
    System.out.println("Kinder");
}
if (Age > 7 && Age <=17 ){
    System.out.println("School");

}
if (Age >= 18 && Age <= 22 ){
    System.out.println("University");
}
if (Age >= 23 && Age <= 60) {
    System.out.println("Work");
}
if (Age >= 60){

    System.out.println("Retired");
}

    }
}
