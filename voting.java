import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        int age;
        Scanner re=new Scanner(System.in);

        System.out.println("enter your age");
        age= re.nextInt();
        if(age<18)
        {
            System.out.println("not elligible");
        }
        else if (age>18&&age<25)
        {
            System.out.println("wait");
        }
        else if (age>25&&age<40)
        {
            System.out.println("ok");
        }



    }

}
