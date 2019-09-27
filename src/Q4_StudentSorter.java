import java.util.Comparator;

public class Q4_StudentSorter implements Comparator<Q4_Student>
{
    public int compare(Q4_Student a,Q4_Student b){
        if(a.getAge()!=b.getAge()){
            return a.getAge()-b.getAge();
        }
        else
        {

            if(a.getName().compareTo(b.getName())!=0)
            {
               return a.getName().compareTo(b.getName());
            }
            else
            {
                return a.getId()-b.getId();

            }
        }
    }

}
