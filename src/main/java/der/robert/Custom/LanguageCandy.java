package der.robert.Custom;


public class LanguageCandy {
	//
	//	NOT-LanguageCandy
	//
	protected static boolean NOT(boolean condition) {
		return condition == false;
	}

	//
	//	should not be instanciated:
	//
	protected LanguageCandy() {}
}
