package staticKeyword;

import java.util.ArrayList;
import java.util.List;

public class staticKeyword{
    static int i = 9;

    public ArrayList<Integer> hello(ArrayList<Integer> x){
        System.out.println(x);
        return x;
    }
    public static void main(String[] args){
        Abc x = new Abc();
        x.calc();
        x.show();

        Abc.show();
        x.show();
        int i = 7;
        System.out.println(i);

        ArrayList<Integer> y = new ArrayList();
        y.add(2);
        y.add(10);
        y.add(90);
        y.add(89);
//        System.out.println(hello(y));

        staticKeyword z = new staticKeyword();
        System.out.println(z.hello(y));



//        Abc.calc();
    }
}

class Abc{
    int i = 10;
    public void calc(){
//        System.out.println(i);
        int i = 1;
        System.out.println("Calculations....");
        System.out.println(this.i);
    }
    public static void show(){
        int i = 2;
        System.out.println(i);
        System.out.println("Display....");
    }
}