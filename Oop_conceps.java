
class Tech {
    String name;
    String surname;
    

    void inset(String n , String m){
        name = m;
        surname = n;
    }

    String out_put1(){
        return ("Area is :"+ name+ surname);

    }
}


public class Oop_conceps {
    

    public static void main(String[] args) {
        Tech name1 = new Tech(); // Creating object
        Tech name2 = new Tech(); // Creating object
        name1.inset("Calistas", "Mlilo ");
    

        System.out.println(name1.out_put1());
        // System.out.println(names.name);
    }
}
