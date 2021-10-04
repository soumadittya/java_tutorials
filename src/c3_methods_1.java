import java.util.*;
class c3_methods_1{
    public static void printText(String text){

        System.out.println("Text : " + text);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a text : ");
            String text = sc.nextLine();
            if((text.toLowerCase()).equals("break")){
                break;
            }
            printText(text);
        }
    }
}