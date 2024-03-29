abstract class retro{
    abstract void calculate_1();
    public void fm(){
        //Concreate method cannot be changed unless modifed
        //notice its not an abstract method
    System.out.println("im a concreate class")
    }
}

/**
 * Abstract_classes
 */
class cls_reto extends retro{

    void calculate_1(){
        System.out.println("Im here im retro");
    }
}

class cls_reto2 extends retro{

    void calculate_1(){
        System.out.println("Im here im retro222");
    }
}

class cls_reto3 extends retro{

    void calculate_1(){
        System.out.println("Im here im retro333");
    }
}

/**
 * Abstract_classes
 */
public class Abstract_classes {

    public static void main(String[] args) {
        cls_reto clr = new cls_reto();
        cls_reto2 clr2 = new cls_reto2();
        cls_reto3 clr3 = new cls_reto3();
        clr.calculate_1();
        clr2.calculate_1();
        clr3.calculate_1();
        clr.fm();





    }
}
