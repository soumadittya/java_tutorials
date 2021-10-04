// inheritance

public class c5_classes_3_inheritance{
    public static void main(String args[]){
        Developer d1 = new Developer();
        System.out.println("x accessed from developer : " + d1.x);

        d1.walk();

        Software_eng se1 = new Software_eng();
        se1.android();
        se1.walk();

        Software_arc sa1 = new Software_arc();
        sa1.walk();
    }
}

class Person3{
    int x = 10;
    public Person3(){
        System.out.println("Person3 constructor_1 called....");
    }
    public Person3(int n){
        System.out.println("Person3 constructor_2 called....");
    }

    void walk(){
        System.out.println("Walk called....");
    }
}

class Developer extends Person3{

    int x= 12;
    public Developer(){
        // super keyword is used to call the
        // constructor of the parent class
        super();
//        super(3); // gives an error
        System.out.println("Developer constructor called....");
//        System.out.println(super().x); // gives an error

        // this will print value of x from developer class
        System.out.println("x from developer : " + x);
    }

    void android(){
        System.out.println("Android....");
    }
}

class Software_eng extends Developer{

}

class Software_arc extends Software_eng{

}