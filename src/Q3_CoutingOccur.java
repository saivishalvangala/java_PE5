import java.util.*;
public class Q3_CoutingOccur {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the length od String array" );
        int n=scan.nextInt();
        String[]a = new String[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextLine();
        }
        HashMap<String,Boolean>hashmap=hashing(a);
        for(Map.Entry m:hashmap.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static HashMap<String,Boolean> hashing(String[] a)
    {
        HashMap<String,Boolean> hashMap=new HashMap<String,Boolean>();
        HashMap<String,Integer> hashMap1=new HashMap<String,Integer>();
        int l=a.length;
        int count=0;
        for(int i=0;i<l;i++){
            if(hashMap.containsKey(a[i])){
                count=hashMap1.get(a[i])+1;
                if(count>=2){
                    hashMap.put(a[i],true);
                    hashMap1.put(a[i],count);
                }
                else
                    hashMap1.put(a[i],count);
            }
            else
            {
                hashMap.put(a[i],false);
                hashMap1.put(a[i],1);
            }
        }
        return hashMap;
    }
}
