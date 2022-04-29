import java.io.*;
import java.util.*;
public class Word implements Serializable,Comparable<Word>
{
String word;
String translate;
Word(){}
Word(String w,String tr){
	word=w;
	translate=tr;
	}
public String toString(){ return word;}
void display()
	{
	System.out.println(word+"   "+translate);
	}
public int compareTo(Word w)
	{
	return this.word.compareToIgnoreCase(w.word);
	}
}