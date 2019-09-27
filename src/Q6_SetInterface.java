import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q6_SetInterface {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Set<String > set=new TreeSet<String>();
        System.out.println("enter the number of values to be entered");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            set.add(scan.next());
        }
        System.out.println("sortedset: "+set);
        ArrayList<String>list=new ArrayList<>(set);
        System.out.println(list);

    }
}
