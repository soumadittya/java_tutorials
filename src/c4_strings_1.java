// String functions

import java.util.*;

class c4_strings_1{
    public static void main(String args[]){
        String s1 = new String("Hello World Soumadittya Ghosh");
        String s2 = new String("Hello World Soumadittya Ghosh");
        String s3 = new String("Uttam Ghosh");
        String s4 = new String("uttam Ghosh");


        // equals function
        // also considers case
        boolean x = s1.equals(s2);
        System.out.println("Boolean x : " + x);

        boolean y = s2.equals(s3);
        System.out.println("Boolean y : " + y);

        boolean z = s3.equals(s4);
        System.out.println("Boolean z : " + z);

        boolean xy = s3.equalsIgnoreCase(s4);
        System.out.println("Boolean xy : " + xy);

        // index0f function
        int n1 = s1.indexOf("H");
        System.out.println("Index of : " + n1);


        // substring function
        // in this case it starts from index 3 and goes upto index 6
        String s6 = s2.substring(3, 7);
        System.out.println("substring : " + s6);

        // trim function
        // removes spaces from starting and ending of a string
        String s7 = " Sudipta Ghosh ";
        s7 = s7.trim();
        System.out.println("Trim s7 : " + s7);

        // getChars function
//        char c1[];
//        String s8 = "Sudipta Ghosh";
//        s8.getChars(0, 4,4);

        // Split function
        String s9[];
        s9 = s2.split(" ");
        System.out.println("Split : ");
        for(int i = 0; i < s9.length; i++){
            System.out.println(s9[i]);
        }


        // contains function
        String s10 = new String("Java is great!");
        System.out.println("Contains : " + s10.contains("java")); // false
        System.out.println("Contains : " + s10.contains("Java")); // true



        // replace function
        String s11 = new String("jaJajaJa");
        s11 = s11.replace("ja", "ls");
        System.out.println("Replace : " + s11);

        // replaceAll function
        String s12 = new String("jaJajaJa");
        s12 = s12.replaceAll("Ja", "Ls");
        System.out.println("Replace All : " + s12);

        // replaceFirst function
        String s13 = new String("jaJajaJa");
        s13 = s13.replaceFirst("Ja", "Ls");
        System.out.println("Replace First : " + s13);

        // replacing a character at a particular index
        // using substring function
        String s14 = new String("Soumadittya Ghosh");
        s14 = s14.substring(0, 3) + "s" + s14.substring(4, s14.length());
        System.out.println("Replacing character at a specific index : " + s14);

        // using character array
        String s15 = new String("Soumadittya Ghosh");
        char c2[] = s15.toCharArray();
        c2[7] = 's';
        s15 = new String(c2);
        System.out.println(s15);

        // Converting integer to string (valueOf function)
        int n2 = 12;
        String s16 = String.valueOf(n2);
        System.out.println("Converting integer to string : " + s16);

        // Converting double to string (valueOf function)
        double d1 = 22.0;
        String s17 = String.valueOf(d1);
        System.out.println("Converting double to string : " + s17);

        // Converting integer to string (Integer.toString function)
        int n3 = 20;
        String s18 = Integer.toString(n3);
        System.out.println("Converting integer to string : " + s18);


        // Converting string to integer
        // using Integer.parseInt() function
        String s19 = "1234";
        int n4 = Integer.parseInt(s19);
        n4 += 10;
        System.out.println("Converting string to integer : " + n4);

        // Converting string to double
        // using Integer.parseInt() function
        String s20 = "1234";
        double d2 = Double.parseDouble(s20);
        d2 += 10;
        System.out.println("Converting string to double : " + d2);

        // Converting string to float
        // using Integer.parseInt() function
        String s21 = "1234";
        float f1 = Float.parseFloat(s19);
        f1 += 10;
        System.out.println("Converting string to india : " + f1);




    }
}