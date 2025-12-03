package kadai_021;

//import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	static HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public static String dialy(String index, String answer) {
		
		dictionary.put(index, answer);
		return answer;
		}
	
}
