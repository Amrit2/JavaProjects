package exercises;

import java.util.Arrays;

public class Sentence {
	private String[] words;
	
	public Sentence (String... words) { 	//... represents that the method accepts a variable number of inputs
		this.words = words;
	}

	public int nWords() {
		int numberOfWords = 0;
		for (int i = 0; i<words.length ; i++) {
			numberOfWords++;
		}
		return numberOfWords;
	}
	
	
	
	public String[] getWords() {
		return words;
	}

	public void reverse() {
		String[] wordSentence = new String[words.length];
//		for(int i= words.length; i > 0; i--) {
//			 wordSentence[i] = words[i];
//		}
		for(int i=0;i<this.words.length;i++)
		{
			wordSentence[i] = this.words[this.words.length-i-1];
			
		}
		this.words = wordSentence;
	}
	
	public String find(String word) {
		String wordSentence = words[0];
		for (int i = 0; i< words.length; i++) {
			if (words[i].equals(word)) {
				wordSentence = words[i];
			}
		}
		return wordSentence;
	}
	
	public void swap(int i, int j) {
		String[] swapedSentence = new String[words.length];
		for (int a = 0; a< words.length; a++) {
			for (int b = 0; b < words.length; b++) {
				if (a == i && b == j) {
					swapedSentence[0] = words[a];
					words[a] = words[b];
					words[b] = words[a];
					
				}
			}
			
		}
	}
	
	public String toString() {
//		return Arrays.toString(this.words);
		String s = "";
		for(String w : this.words)
		{
			s+= (w+" ");
		}
		return s;
	}
	
	public static void main(String[] args) {
//		Sentence sentence = new Sentence("hello", "world");
//		System.out.println(sentence);
		Sentence s = new Sentence("Kate","likes","to","program");
		System.out.println(" Original Sentence: "+s);
		s.swap(1,4);		
		System.out.println("Swap words 1 and 4: "+s);
		s.reverse();
		System.out.println("  Reverse Sentence: "+s);
	}
	
}
