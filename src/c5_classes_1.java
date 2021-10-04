class c5_classes_1{
    public static void main(String args[]){
        Person p1 = new Person();
        p1.name = "Soumadittya";
        System.out.println(p1.name);

        Person p2 = new Person();
        p2.age = 32;
        System.out.println(p2.age);

        p1.print_name();
        p2.print_age();
    }
}

class Person{
    String name;
    int age;

    void print_name(){
        System.out.println("name : " + name);
    }

    void print_age(){
        System.out.println("age : " + age);
    }

    void print_age(int age){
        System.out.println("New age : " + age);
    }
}