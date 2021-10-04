package abstractClass;

public class Code1{
    public static void main(String args[]){

        Audi a1 = new Audi();
        a1.stop();

    }
}

class Audi extends Car{
    @Override
    void stop() {
        System.out.println("Audi stop....");
    }
}

class BMW extends Car{
    @Override
    void stop(){
        System.out.println("BMW stop....");
    }
}

// object cannot be created for a abstract class
abstract class Car{
    int price;

    // non - abstract methods can be defined inside an abstract class
     void start(){
         System.out.println("abstract class car....");
     }

     // need not to define the method
    // abstract method has to be defined in the children class
    // abstract functions can only be inside an abstract class
     abstract void stop();
}