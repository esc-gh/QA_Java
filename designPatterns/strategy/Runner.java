package designPatterns.strategy;

public class Runner {

	public static void main(String[] args) {
		LanguageSwapper ls = new LanguageSwapper();
		ls.setLanguage(new English());
		ls.helloGoodye();
		ls.setLanguage(new Japanese());
		ls.helloGoodye();
		ls.setLanguage(new Russian());
		ls.helloGoodye();

	}

}
