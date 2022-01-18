package designPatterns.strategy;

public class LanguageSwapper {
	Language language;

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void helloGoodye() {
		language.greeting();
		language.farewell();
	}

}
