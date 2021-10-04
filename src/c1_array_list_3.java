// all functions of arraylist

import java.lang.reflect.Array;
import java.util.*;
class c1_array_list_3{
    public static void main(String args[]){

        // add function
        List<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(7);
        al1.add(8);
        al1.add(6);
        System.out.println(al1);


        // add function with index number
        List<Integer> al2= new ArrayList<>();
//        this will give an error as index 7 does not exist
//        al2.add(7, 11);

        al2.add(2);
        al2.add(7);
        al2.add(8);
        al2.add(6);
        System.out.println("al2 initial : " + al2);
        // this will add 12 at index 2 and shift the next indexes by 1
        al2.add(2, 12);
        System.out.println(al2);


            // addAll function
            // This method is used to append all the elements
            // from a specific collection to the end of the mentioned list,
            // in such an order that the values are returned by the
            // specified collection’s iterator.

            List<Integer> al3 = new ArrayList<>();
            al3.add(2);
            al3.add(7);
            al3.add(8);
            al3.add(6);

            List<Integer> al4 = new ArrayList<>();
            al4.add(10);
            al4.add(12);
            al4.add(14);
            al4.add(16);
            System.out.println("al3 initial : " + al3);
            System.out.println("al4 initial : " + al4);

            al3.addAll(al4);
            System.out.println("Final al3 : " + al3);
            System.out.println("Final al4 : " + al4);



        // addAll function with index
        // Used to insert all of the elements starting
        // at the specified position from a specific collection
        // into the mentioned list

        List<Integer> al5 = new ArrayList<>();
        al5.add(2);
        al5.add(7);
        al5.add(8);
        al5.add(6);

        List<Integer> al6 = new ArrayList<>();
        al6.add(10);
        al6.add(12);
        al6.add(14);
        al6.add(16);

        System.out.println("al3 initial : " + al5);
        System.out.println("al4 initial : " + al6);

        al5.addAll(2, al6);
        System.out.println("Final al5 : " + al5);
        System.out.println("Final al6 : " + al6);

        // clear function
        //This method is used to remove all the
        // elements from any list.

        List<Integer> al7 = new ArrayList();
        al7.add(3);
        al7.add(8);
        System.out.println("al7 initial : " + al7);
        al7.clear();
        System.out.println("al7 : " + al7);


        //  get function
        // Returns the element at the specified
        // position in this list.
        List<Integer> al8 = new ArrayList();
        al8.add(45);
        al8.add(90);
        al8.add(56);
        al8.add(34);
        System.out.println("al8 index 2 : " + al8.get(2));

        // set function
        // Replaces the element at the
        // specified position in this list with the s
        // specified element.

        List<Integer> al9 = new ArrayList();
        al9.add(45);
        al9.add(90);
        al9.add(56);
        al9.add(34);
        System.out.println("al9 initial : " + al9);
        al9.set(2, 9);
        System.out.println("al9 final : " + al9);

        // remove function
        // removes an element from a particular index
        List<Integer> al10 = new ArrayList();
        al10.add(45);
        al10.add(90);
        al10.add(56);
        al10.add(34);
        System.out.println("al10 initial : " + al10);
        al10.remove(2);
        System.out.println("al10 final : " + al10);

        // removeAll function
        List<Integer> al11 = new ArrayList();
        al11.add(45);
        al11.add(90);
        al11.add(56);
        al11.add(34);
        System.out.println("al11 initial : " + al11);

        List<Integer> al12 = new ArrayList();
        al12.add(56);
        al12.add(90);
        System.out.println("al12 initial : " + al12);

        // this will remove all the items from al11 which are
        // common with al12
        al11.removeAll(al12);

        System.out.println("al11 final : " + al11);
        System.out.println("al12 final : " + al12);


        // contains function
        // Returns true if this list contains
        // the specified element
        List<Integer> al13 = new ArrayList();
        al13.add(45);
        al13.add(90);
        al13.add(56);
        al13.add(34);
        System.out.println("Contains : " + al13.contains(90));

        // isEmpty function
        List<Integer> al14 = new ArrayList();
        al14.add(17);
        al14.add(19);
        System.out.println("al14 initial : " + al14);
        al14.clear();
        System.out.println("al14 is empty : " + al14.isEmpty());



        // toArray function
        List<Integer> al15 = new ArrayList();
        al15.add(45);
        al15.add(90);
        al15.add(56);
        al15.add(34);
        System.out.println("al11 initial : " + al11);

        Integer[] i1 = new Integer[al15.size()];
        i1 = al15.toArray(i1);
        System.out.print("al15 to i1 array : ");
        for(int i = 0; i < i1.length; i++){
            System.out.print(i1[i] + " ");
        }
        System.out.println();


















    }
}