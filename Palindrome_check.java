import java.util.Scanner;


public class Palindrome_check {

    
    public static void main(String[] args) {
        

        System.out.println("Enter a word:");
        Scanner user_input = new Scanner(System.in);
        String normal_word = user_input.nextLine();
        String revesed_word = string_conveter(normal_word);
        
        if (revesed_word.equals(normal_word)){
            System.out.println("This is a palindrome:" + normal_word +"="+ revesed_word );
        }
        else{
            System.out.println("Not a palindrome.");
        }
    }
    
    private static String string_conveter(String word_1) {
        
        String rev_word = "";
    
        for(int i = word_1.length()-1; i >=  0 ; i--){
            rev_word += word_1.charAt(i);
        }
        return rev_word;
    } 
}
