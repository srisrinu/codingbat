package Strings;
import java.util.Scanner;
public class Tags {
	public String makeTags(String tag, String word)
	{	return ('<' + tag + '>' + word + '<' + '/' + tag + '>');	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
      Tags t=new Tags();
      String tag=sc.nextLine();
      String word=sc.nextLine();
      System.out.println(t.makeTags(tag,word));
	}

}
