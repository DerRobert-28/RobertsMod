package net.mcreator.derrobert.Custom;


import java.lang.Character;
import java.lang.String;


public class CommonUtils
{
	//
	//	hole Einzelzeichen:
	//
	public static String charAt(String st, int index)
	{
		return String.valueOf(st.charAt(index));
	}

	//
	//	hole ASCII-Zeichen:
	//
	public static String charAt(int code)
	{
		return Character.toString((char)code);
	}

	//
	//	hole ASCII-Code:
	//
	public static int charCodeFrom(String st)
	{
		return (int)(st.toCharArray()[0]);
	}
	public static int charCodeFrom(String st, int index)
	{
		return (int)(st.toCharArray()[index]);
	}

}
