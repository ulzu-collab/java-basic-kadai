package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		
	dialy("apple", "りんご");
	dialy("peach", "桃");
	dialy("banana", "バナナ");
	dialy("lemon", "レモン");
	dialy("pear", "梨");
	dialy("kiwi", "キウィ");
	dialy("strawberry", "いちご");
	dialy("grape", "ぶどう");
	dialy("muscat", "マスカット");
	dialy("cherry", "さくらんぼ");
		
	//System.out.println(dictionary.get("apple"));
	
	String[] searchWords = { "apple", "banana", "grepe", "orenge" };
	
	for (String word : searchWords ) {
		if(dictionary.containsKey(word)) {
			System.out.println(word + "の意味は" + dictionary.get(word));
		} else {
			System.out.println(word + "は辞書に存在しません");
		}
		
	}
	
	}

}
