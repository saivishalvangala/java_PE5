import java.util.*;
public class Q5_TwoKeyValueMap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashMap<String,String>hashmap=new HashMap<>();
        String key;
        String  val;
        for(int i =0;i<2;i++){
            System.out.println("enter key "+i+1);
            key=scan.next();
            System.out.println("enter value"+i+1);
            val=scan.next();
            hashmap.put(key,val);
        }
        String val1="";
        String key1;

        Iterator<String> itr=hashmap.keySet().iterator();
        int count=0;
        while(itr.hasNext())
        {

            if(count==0) {
                key1=itr.next();
                if (!(hashmap.get(key1).equals(""))) {
                    val1 = hashmap.get(key1);
                    hashmap.put(key1, "");

                    System.out.println("1");
                    count++;
                }
            }
            else
                System.out.println("2");
                hashmap.put(itr.next(),val1);

        }
        Iterator<String> itr1=hashmap.keySet().iterator();
        while(itr1.hasNext()){
            key1=itr1.next();
            System.out.println(key1+" "+hashmap.get(key1));
        }


    }
}
