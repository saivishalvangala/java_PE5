import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2_FreqOfWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the String input");
        String s=scan.nextLine();
        Pattern p=Pattern.compile("[a-z]+");
        Matcher match=p.matcher(s);
        String a;
        HashMap<String,Integer> h=new HashMap<>();
        while(match.find())
        {
            a=match.group(0);
            if(h.containsKey(a)){
                h.put(a,h.get(a)+1);
       //         System.out.println("10");
            }
            else
                h.put(a,1);
      //      System.out.println("11");
        }
        for(Map.Entry m:h.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }



    }
}
