package names;
import java.util.Scanner;
/**
 * My_name_surname
 */
public class My_name_surname{

    public String[] forenames(){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Name: ");
        String name =  userinput.nextLine();
        System.out.println("Surname: ");
        String van = userinput.nextLine();
        userinput.close();
        String[] frname = new String[2];
        frname[0] = name;
        frname[1] = van;
        return frname;
    }

    public void showman(String name,String van){
        System.out.println("You are wealthy "+name+" "+ van + "!!!");

    }
}
