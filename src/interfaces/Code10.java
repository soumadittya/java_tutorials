package interfaces;

// if a class implements an interface
// then all the abstract method inside the the interface
// have to be defined inside the child

// in other words we can say it is compulsory to
// define all the abstract methods inside an interface,
// in the class which is implementing the interface

// example - in interface there are two abstract
// methods start and stop, so both the methods have
// to be defined in the Code10 class

public class Code10 implements Car, Person10{
    public static void main(String args[]){
//        start(); // this gives error
//        stop(); // this gives error


        Code11 c11 = new Code11();
        c11.start();
        c11.stop();
        c11.walk();
        int age = c11.age;
        System.out.println(age);
    }

    // this method is in Car Interface
    @Override
    public void start() {
        System.out.println("Start function called....");
    }

    // this method is in Car Interface
    @Override
    public void stop() {
        System.out.println("Stop function called....");
    }

    // this method is in Person 10 interface
    @Override
    public void walk(){

    }
}

class Code11 implements Car, Person10{

    public Code11(){
        System.out.println();
    }
    @Override
    public void start() {
        System.out.println("Start function called....");
    }

    // this method is in Car Interface
    @Override
    public void stop() {
        System.out.println("Stop function called....");
    }

    @Override
    public void walk(){
        System.out.println("Walk function called....");
    }
    // this method is in Person 10 interface

}


interface Car{

    // inside interfaces all the methods are public
    // and abstract by default
    void start();

    // we can specifically mention public and
    // abstract keyword before a function
    void stop();
}

interface Person10{

//    int age; // this gives error
    int age = 90;
    void walk();
}