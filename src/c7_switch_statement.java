// switch statement
import java.util.*;

class c7_switch_statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s;
        while(true){
            System.out.print("Enter a string : ");
            s = sc.nextLine();
            System.out.println();
            switch(s) {
                case "World":
                    System.out.println("World");
                    break;
                case "Hello":
                    System.out.println("Hello");
                    break;
                case "Break":
                    break;
                default:
                    System.out.println("Default");
                }
        }
    }
}