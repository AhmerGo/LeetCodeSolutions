import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class CollectionsSortTech { 
    public static void main(String[] args){ 
        ArrayList<Word> a = new ArrayList<>();

        a.add(new Word("Solder"));
        a.add(new Word("doom"));
        a.add(new Word("form"));

        System.out.println(a);

        Collections.sort(a, new Comparator<Word>()
        {
            public int compare(Word o1, Word o2) {
                return o1.sorted.compareToIgnoreCase(o2.sorted) ;
            }
        });



        System.out.println(a);



    }
}