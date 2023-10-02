/**
 * @author Ahmer Javed Gondal
 * @version 04-20-2023
 * 
 * This class extends the ArrayList class and adds the following functions: reads files and stores data into the list, counts the number of anagrams in a given method call, and 
 * reads through the list for anagram families.
 * <pre> 
 * We use the buffered and file reader to scan through the passed String f which is meant to be a dataFile. In the constructor, we use the collection's sort method to
 * "override" the compare method in word so that we can minimize the need for corollary arrays and conversions. The average time complexity for this sort is also O(n*log(n)).
 * In the countAnagrams method, we find the index position of a given word in the sorted Array Dictionary through a binary search and then use an expanding window 
 * from that point to assess the number of anagrams in that given family. The displayBigFamilies method just checks every element for an anagram count greater than or equal to 6 
 * and then prints it out.
 * </pre>
 */
import java.util.ArrayList;
import java.util.ListIterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
public class ArrayDictionaryCollections extends ArrayList<Word> {

    /**
     * Constructor that accepts a dataFile string and then inputs the data into the wordlist through a bufferedreader.
     * Sorts array list via comparator/collections.sort method.
     * @param f datafile we'll be reading.
     * @throws IOException
     */
    public ArrayDictionaryCollections(String f) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String word;

        while((word = br.readLine())!=null) {
            this.add(new Word(word));
        }
        br.close();

        // can sort via collections instead of using a helper array to qsort
        Collections.sort(this, new Comparator<Word>()
        {
            public int compare(Word o1, Word o2) {
                return o1.getSorted().compareToIgnoreCase(o2.getSorted()) ;
            }

        });
        

    }

    /**
     * This method counts the number of anagrams in the array in accordance to the passed parameter using binary search.
     * @param w
     * @returns an int value indicating the number of anagrams to the word w in the entire list.
     */
    public int countAnagrams(Word w) {  
        int anaCount = 1;
        Comparator<Word> compare = new Comparator<Word>() {
            public int compare(Word o1, Word o2){
                return o1.getSorted().compareToIgnoreCase(o2.getSorted());
            }
        };
        int start = Collections.binarySearch(this, w, compare);
        int left = start - 1 < 0 ? start : start - 1;
        int right = start + 1 > this.size() ? start : start + 1;
        while(left >= 0 || right < this.size()) {
            // short circuit-based break & check.
            if(left >= 0 && right < this.size() && !w.anagramCheck(this.get(left)) && !w.anagramCheck(this.get(right))){
                break;
            }
            if(left >= 0 && w.anagramCheck(this.get(left))) {
                anaCount++;
            }
            if(right < this.size() && w.anagramCheck(this.get(right))) {
                anaCount++;
            }      
            left--;
            right++;   
        }
        return anaCount;

        

    }
    
    /**
     * Displays every element this list.
     * @void 
     */
    public void display(){
        ListIterator<Word> it = this.listIterator(); 
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }



    
    /**
     * This method traverses through the data array and then passes the word element to countAnagrams: which returns the number of anagrams in the array.
     * @void method.
     */
    public void displayBigAnagramFamilies() {
        for(int i = 0; i < this.size(); i ++) {
            if(countAnagrams(this.get(i)) >= 6) {
                System.out.println(this.get(i));
            }
        }
    }  
}