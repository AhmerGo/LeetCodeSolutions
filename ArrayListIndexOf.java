import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class ArrayListIndexOf{
    public static void main(String[] args){

        ArrayList<Word> a = new ArrayList<>();
        a.add(new Word("Most"));
        a.add(new Word("Lost"));
        a.add(new Word("Lost"));
        a.add(new Word("Lost"));
        a.add(new Word("Most"));

        System.out.println(a.indexOf(new Word("Lost")));
        System.out.println(a.lastIndexOf(new Word("Lost")));

        Comparator<Word> compare = new Comparator<Word>() {
            public int compare(Word o1, Word o2){
                return o1.getSorted().compareToIgnoreCase(o2.getSorted());
            }
        };

        int index = Collections.binarySearch(
                a, new Word("Lost"),compare);
        System.out.println(index);








    }
}