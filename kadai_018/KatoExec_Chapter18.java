package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		((KatoTaro_Chapter18) taro).setGivenName("太郎");
		taro.commonlntrobuce();
		taro.eachIntroduce();

		((KatoTaro_Chapter18) ichro).setGivenName("一郎");
		ichro.commonlntrobuce();
		ichro.eachIntroduce();

		((KatoTaro_Chapter18) hanako).setGivenName("花子");
		hanako.commonlntrobuce();
		hanako.eachIntroduce();


	}

}
