// this keyword
// calling one constructor from the other

public class c5_classes_2_constructors{
    public static void main(String args[]){
        Person2 p1 = new Person2(12, 19);
    }
}

class Person2{
    static int count;
    public Person2(){
        count++;

        System.out.println("Constructor 1 has been called....");
        System.out.println("Count : " + count);

    }

    public Person2(int num_1, int num_2){
        this(1444);
        System.out.println("Constructor 3 has been called....");
    }
    public Person2(int num){
//        this();
        System.out.println("Constructor 2 has been called....");
    }

}