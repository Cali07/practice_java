/**
 * InnerInhearitace
 */
class InnerInheritance {
    String op = "super:first:one";
    void sup_op(){
        System.out.println("WHO AM I: "+op);
}  }

class subInheritance extends InnerInheritance {
    String op1 = "vice:second:one";
}


public class Inhearitace {
    public static void main(String[] args) {
        subInheritance p = new subInheritance();
        p.sup_op();
        System.out.println(p.op1);
    }
}
