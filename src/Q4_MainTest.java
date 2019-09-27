import java.util.*;
public class Q4_MainTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of stuydent objects to be created");
        int n=scan.nextInt();
        int id,age;
        String name;
        ArrayList<Q4_Student> list=new ArrayList<Q4_Student>();
        for(int i=0;i<n;i++)
        {

            System.out.println("enter id");
            id=scan.nextInt();
            System.out.println("enter name");
            name=scan.next();
            System.out.println("enter age");
            age=scan.nextInt();
            Q4_Student stud=new Q4_Student(id,name,age);
            list.add(stud);
        }
        Collections.sort(list,new Q4_StudentSorter());
        System.out.println(list);
    }
}
