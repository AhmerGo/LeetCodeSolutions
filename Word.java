/**
 * Provides a simple word object that stores a word together with its letters
 * sorted.
 *
 * @author Ahmer Javed Gondal
 * @version 04-03-2023
 * <pre>
 * Takes in a string then converts it into a word object by alphabetically sorting the word's characters and then setting the "sorted" attribute to that new string.
 * We'll override the equals and hashcode methods to allow us to really compare word objects. Additionally, there's an implemented anagramChecker method which compares the sorted 
 * string of this object to the passed sorted string of another object.
 * </pre>
 */
import java.util.Arrays;

public class Word
{
	public String word;    // the word
	public String sorted;  // the word re-arranged so that its letters are sorted

	/**
	 * Store the word and create a sorted version of the word.
	 *
	 * @param word the word to be stored
	 */
	public Word(String word)
	{
		char [] letters= word.toCharArray();
		Arrays.sort(letters);
		this.word= word;
		this.sorted= new String(letters);
	}

	public String getSorted(){
		return this.sorted;
	}

	/**
	 * Just show the regular word when object is printed.
	 *
	 * @return the regular word
	 */
	public String toString()
	{
		return this.word + "(" + sorted + ")";
	}

	/**
	 * Overrides the built-in equals method to allow us to the check whether objects are actually equivalent in terms of attributes.
	 * @param obj will be the object we'll be typecasting and checking for equivalence to this.
	 * @return a boolean indicating whether the object in the parameter is equivalent to this.object.
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Word)) return false;
		if(obj == this) return true;
		Word other = (Word) obj;
		return this.word.equals(other.word);
	}

	/**
	 * Overrides the built-in hashCode() method to allow us to the check whether objects are actually equivalent in terms of attributes.
	 * @return an int indicating the hash value of the string word.
	 */
	@Override
	public int hashCode() {
		return word.hashCode();
	}

	/**
	 * This method checks whether the passed word object is an anagram to this word object.
	 * @param w
	 * @return a boolean indicating whether the passed word is an anagram to THIS word.
	 */
	public boolean anagramCheck(Word w) {
		return w.sorted.equals(this.sorted);
	}

	/**
	 * This method compares two strings and returns a value based on the size of the two (alphabetical order)
	 * @param obj the object we're comparing "this" to.
	 * @return an int indicating whether the external object is smaller or larger than "this" object.
	 */
	public int compareTo(Object obj) {
		Word other = (Word) obj; 
		return this.sorted.compareToIgnoreCase(other.sorted) ;
	}

	


}
