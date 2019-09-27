import java.util.*;
public class Q1_UpdateArrayList {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many items in ArrayList?");

        int n=scan.nextInt();

        ArrayList<String>list=new ArrayList<String>();

        System.out.println("enter the elements continuosly ");
        for(int i=0;i<n;i++){
            list.add(scan.next());
        }
        System.out.println(list);
        System.out.println("enter the number of element to be changed?");
        int change=scan.nextInt();

        System.out.println("enter the String to be replaced with old");
        String newString=scan.next();
        ArrayList<String>newlist=update(list,newString,change-1);
        System.out.println("UpdatedList: "+ newlist);

        ArrayList<String>empty=empty(list);
        System.out.println("empty list"+ empty);
    }
    public static ArrayList<String> update(ArrayList<String>list, String s, int n)
    {
        list.remove(n);
        list.add(n,s);
        return list;
    }
    public static ArrayList<String > empty(ArrayList<String> list)
    {
        list.clear();
        return list;
    }
}
