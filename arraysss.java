import java.util.Scanner;
public class arraysss {
    public static void main(String[] args) {
        int n,total=0,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of subjects:");
        n=sc.nextInt();
        int marks[]=new int[n];
        System.out.println("enter marks");
        for ( int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        percentage=total/n;
        System.out.println("total is"+total);
        System.out.println("percentage is"+percentage);
        System.out.println("marks of subject 2 is"+marks[2]);3





    }
}
