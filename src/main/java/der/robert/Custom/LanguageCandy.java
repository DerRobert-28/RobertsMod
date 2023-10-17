package der.robert.Custom;


public final class LanguageCandy {
	//
	//	NOT-LanguageCandy
	//
	public static boolean NOT(boolean condition) {
		return condition == false;
	}

	//
	//	should not be instanciated:
	//
	private LanguageCandy() {}
}
