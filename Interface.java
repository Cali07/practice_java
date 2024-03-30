interface Interface1 {
    void connect();
    void disconnected();
}


class Interface2 implements Interface1{

    public void connect(){
        System.out.println("Im connected");
    }

    public void disconnected(){
        System.out.println("Im Disconnected");
    }
}


public class Interface {
    public static void main(String[] args) {
        Interface2 p = new Interface2();
        p.connect();
        p.disconnected();
    }
    
}