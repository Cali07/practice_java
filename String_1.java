import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

class String_1{

// In java we have string methods these are just some of them
    public static void main(String[] args){
        String v1 = "This time is my time to shine!!!";
        String v2 = "FresH";
        
        // char er = v1.charAt(0);
        // System.out.println(er);
        System.out.println("______________");
        System.out.println(v1.equalsIgnoreCase(v2));
        System.out.println(v1.replace("e", "c"));
        // compareTo, compareToIgnoreCase, concat ,equals, .equalsIgnoreCase(),replace
        // char[] arr_1 = new char[v1.length()];
        String a_1[] = v1.split(" ");
        System.out.println(a_1);


        // string comparison sugetsed use equals not == unless you will be in type:Pool 

        String e1 = "Fresh";
        String e2 = "Fresh";

        // have the sane pool but String e2 = new String("Fresh");
        System.out.println(e1+"______"+e2);
        if (e1 == e2){
            System.out.println("im the same");
        }
        else {
            System.out.println("IM not the same");
        }


    }
    

}