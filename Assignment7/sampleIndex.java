import java.lang.StringBuilder;

public class sampleIndex {

  public static void main(String[] args)
  {
	String s = "Hello";
	String q="?????";
	
	char[] qChars = q.toCharArray();
	System.out.println(qChars);
	qChars[2] = 'e';
	q = String.valueOf(qChars);

	System.out.println(q);
	System.out.println(qChars);

	

	
   }
}
