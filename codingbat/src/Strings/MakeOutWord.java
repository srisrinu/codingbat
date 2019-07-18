package Strings;
import java.util.Scanner;
public class MakeOutWord {
	public String makeOutWord(String out, String word) {
		  return(out.substring(0,2)+word+out.substring(2,4));
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  MakeOutWord m=new MakeOutWord();
      String out=sc.nextLine();
      String word=sc.nextLine();
      System.out.println(m.makeOutWord(out,word));
	}

}
