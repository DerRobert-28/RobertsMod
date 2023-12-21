package der.robert.Custom;

import java.lang.Character;
import java.lang.String;
import net.minecraftforge.versions.forge.ForgeVersion;

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


	//
	//	hole Mod-Version:
	//
	public static String getForgeVersion()
	{
		return ForgeVersion.getVersion();
	}
	///	TODO: Herausfinden, wie man die Workspace-Version dynamisch holt!
	public static String getModVersion()
	{
		//InputStream is = this.getClass().getClassLoader().getResourceAsStream("./META-INF/mods.toml");
		//var ver = net.minecraftforge.versions.mcp.MCPVersion.getMCVersion();
		//return ver;
		return "1.23.45";
	}

}
