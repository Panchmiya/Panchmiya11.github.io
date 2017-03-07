import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class kp {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "We test coders. Give us a try?";
		String regex="[.!?]";
		String str[]= s.split(regex );
		int c=0;
		for (String string : str) {
			c++;
		}
		System.out.println(c);
		
	}
}
