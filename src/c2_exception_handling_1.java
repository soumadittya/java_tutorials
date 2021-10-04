class c2_exception_handling_1{
    public static void main(String args[]){
        int marks[] = {12, 14, 16};
        try {
            System.out.println(marks[10]);
        }
        catch(Exception e){
            System.out.println("Exception : " + e);
        }
        System.out.println("Hello....");
    }
}