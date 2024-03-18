public class Learning_oop {

    //Encapslation//ABSTRACTION/inheritence//Polomosfism

    //Encapsalation
    private static void run_1(){
        for(int i = 0 ; i<10; i++ )
        System.out.println("I'm running now: "+i);

    }

    
    
    public class InnerLearning_oop extends Learning_oop {
        
        
        public static void main(String[] args) {
            run_1();
            
            
        }
    }
    
}


/**
 * InnerLearning_oop
 */

