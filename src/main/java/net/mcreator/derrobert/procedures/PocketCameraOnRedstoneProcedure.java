package net.mcreator.derrobert.procedures;
//
//	CUSTOM
//
import der.robert.Custom.BlockWorldUtils;
//
//	JAVA
//
import java.io.File;
import java.lang.Exception;
import java.lang.String;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.UUID;
//
//	JAVAX
//
import javax.imageio.ImageIO;
//
//	MINECRAFT
//
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
//
//
public class PocketCameraOnRedstoneProcedure
{
	private static BlockWorldUtils world;
	

	public static boolean execute(LevelAccessor level, BlockPos pos)
	{
		return execute(level, pos.getX(), pos.getY(), pos.getZ());
	}

	public static boolean execute(LevelAccessor level, double x, double y, double z)
	{
		try
		{
			world = BlockWorldUtils.of(level).at(x, y, z);
			//
			var _screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			var _rect = new Rectangle(_screenSize);
			var _robot = new Robot();
			BufferedImage _image = _robot.createScreenCapture(_rect);
			String _uuid = UUID.randomUUID().toString();
			String _winHome = System.getenv("USERPROFILE");
			String _path = String.format("%s%s%s", _winHome, File.separator, "RobertsMod");
			var _directory = new File(_path);
			if(!_directory.exists())
			{
	            _directory.mkdirs();
			}
			String _imageFile = String.format("%s%sScreenshot-%s", _path, File.separator, _uuid);
			var _file = new File(_imageFile);
			ImageIO.write(_image, "png", _file);
			world.execute(String.format("say %s %s", "Saved screenshot:", _imageFile));
			return true;
		}
		catch(Exception e)
		{
			world.execute(String.format("say %s", e.getMessage()));
			return false;
		}
	}
}
