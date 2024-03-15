public class Vowels_Counter {
    
    public static void main(String[] args) {

        String var1 = "I love pie and my two 2 children are always Happy!!!";
        String vowels = "AEIOU".toLowerCase();
        Integer number_of_vowels = 0;
        for(int i = 0; i < vowels.length(); i++){
            for(int y = 0; y <var1.length(); y++ ){
                if (var1.charAt(y)==(vowels.charAt(i))){
                    number_of_vowels++;
                }}}
        System.out.println(number_of_vowels);
    }

}
