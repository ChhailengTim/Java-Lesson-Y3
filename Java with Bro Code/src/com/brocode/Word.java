import java.io.*;
import java.util.*;
public class Word implements Serializable,Comparable<Word>
{
	String word;
	String translate;
	public String toString(){ return word;}
	Word(String w,String t)
	{
		word=w;
		translate=t;	
	}
	public int compareTo(Word obj)
		{
			return this.word.compareToIgnoreCase(obj.word);
			// return this.n-obj.n;
		}
	void display()
	{
		System.out.println("--------------------------------------------");
		System.out.println(word+ " : " +translate);
		System.out.println("--------------------------------------------");
			
	}

}