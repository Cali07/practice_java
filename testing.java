import names.My_name_surname;
import names.Balance;

public class testing {
    public static void main(String[] args) {
        String a,b;
        My_name_surname p = new My_name_surname();
        Balance bal = new Balance();
        String[] big_list = p.forenames();
        a = big_list[0];
        b = big_list[1];
        p.showman(a, b);
        bal.main();

    }
}
