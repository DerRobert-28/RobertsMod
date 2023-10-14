package net.mcreator.derrobert.Custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.LevelAccessor;
import com.google.common.base.Supplier;


public class BlockWorldUtils
{
	//
	//	lokale Welt-Daten:
	//
	private final LevelAccessor level;
	private double x, y, z;


	//
	//	generiere Zugirff auf aktuelle Welt:
	//
	public static BlockWorldUtils of(LevelAccessor level)
	{
		return new BlockWorldUtils(level);
	}


	//
	//	Welt-Position:
	//
	public BlockWorldUtils at(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		return this;
	}
	public void locate(double x, double y, double z)
	{
		this.at(x, y, z);
	}


	//
	//	hole Block als Position:
	//
	public BlockPos getPosition()
	{
		return BlockPos.containing((int)this.x, (int)this.y, (int)this.z);
	}
	public BlockPos getPosition(double x, double y, double z)
	{
		return BlockPos.containing((int)x, (int)y, (int)z);
	}


	//
	//	hole Block als Status:
	//
	public BlockState getState()
	{
		BlockPos _bp = this.getPosition();
		return this.getState(_bp);
		
	}
	public BlockState getState(double x, double y, double z)
	{
		BlockPos _bp = this.getPosition(x, y, z);
		return this.getState(_bp);
	}
	public BlockState getState(BlockPos bp)
	{
		return this.level.getBlockState(bp);
	}

	//
	//	hole einen Block (direkt):
	//
	public Block getBlock()
	{
		return this.getState().getBlock();
	}
	public Block getBlock(double x, double y, double z)
	{
		return this.getState(x, y, z).getBlock();
	}
	public Block getBlock(BlockPos bp)
	{
		BlockState _bs = this.getState(bp);
		return this.getBlock(_bs);
	}
	public Block getBlock(BlockState bs)
	{
		return bs.getBlock();
	}


	//
	//	setze einen Block:
	//
	public boolean setBlock(BlockState bs, BlockPos bp)
	{
		return this.level.setBlock(bp, bs, 3);
	}
	public boolean setBlock(BlockState bs, double x, double y, double z)
	{
		return this.level.setBlock(this.getPosition(x, y, z), bs, 3);
	}


	//
	//	hole Blickrichtung:
	//
	public Direction getDirection()
	{
		BlockState _bs = this.getState();
		return this.getDirection(_bs);
	}
	public Direction getDirection(double x, double y, double z)
	{
		BlockState _bs = this.getState(x, y, z);
		return this.getDirection(_bs);
	}
	public Direction getDirection(BlockState bs)
	{
		Property<?> _p = this
			.getBlock(bs)
			.getStateDefinition()
			.getProperty("facing");
		//
		//	Blickrichtung kann direkt geholt werden:
		//
		if(_p != null && bs.getValue(_p) instanceof Direction _d)
		{
			return _d;
		}
		//
		//	Blickrichtung nach oben oder unten:
		//
		if(bs.hasProperty(BlockStateProperties.AXIS))
		{
			return Direction.fromAxisAndDirection(
				bs.getValue(BlockStateProperties.AXIS),
				Direction.AxisDirection.POSITIVE
			);
		}
		//
		//	Blickrichtung zur Seite:
		//
		if(bs.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
		{
			return Direction.fromAxisAndDirection(
				bs.getValue(BlockStateProperties.HORIZONTAL_AXIS),
				Direction.AxisDirection.POSITIVE);
		}
		//
		//	Im Zweifel schaut der Block immer nach Norden:
		//
		return Direction.NORTH;
	}


	//
	//	hole Block HINTER aktuellem:
	//
	public BlockPos getBackwardBlock()
	{
		return this.getBackwardBlock(this.getDirection(), this.x, this.y, this.z);
	}
	public BlockPos getBackwardBlock(Direction d, double x, double y, double z)
	{
		double _bx = this.getBackwardX(d, x);
		double _by = this.getBackwardY(d, y);
		double _bz = this.getBackwardZ(d, z);
		return this.getPosition(_bx, _by, _bz);
	}
	public double getBackwardX()
	{
		return this.getBackwardX(this.getDirection(), this.x);
	}
	public double getBackwardX(Direction d, double x)
	{
		double _bx = x;
		if(d == Direction.EAST)
		{
			_bx--;
		}
		if(d == Direction.WEST)
		{
			_bx++;
		}
		return _bx;
	}
	public double getBackwardY()
	{
		return this.getBackwardY(this.getDirection(), this.y);
	}
	public double getBackwardY(Direction d, double y)
	{
		double _by = y;
		if(d == Direction.DOWN)
		{
			_by++;
		}
		if(d == Direction.UP)
		{
			_by--;
		}
		return _by;
	}
	public double getBackwardZ()
	{
		return this.getBackwardZ(this.getDirection(), this.z);
	}
	public double getBackwardZ(Direction d, double z)
	{
		double _bz = z;
		if(d == Direction.NORTH)
		{
			_bz++;
		}
		if(d == Direction.SOUTH)
		{
			_bz--;
		}
		return _bz;
	}


	//
	//	hole Block VOR aktuellem:
	//
	public BlockPos getForwardBlock()
	{
		return this.getForwardBlock(this.getDirection(), this.x, this.y, this.z);
	}
	public BlockPos getForwardBlock(Direction d, double x, double y, double z)
	{
		double _fx = this.getForwardX(d, x);
		double _fy = this.getForwardY(d, y);
		double _fz = this.getForwardZ(d, z);
		return this.getPosition(_fx, _fy, _fz);
	}
	public double getForwardX()
	{
		return this.getForwardX(this.getDirection(), this.x);
	}
	public double getForwardX(Direction d, double x)
	{
		double _fx = x;
		if(d == Direction.EAST)
		{
			_fx++;
		}
		if(d == Direction.WEST)
		{
			_fx--;
		}
		return _fx;
	}
	public double getForwardY()
	{
		return this.getForwardY(this.getDirection(), this.y);
	}
	public double getForwardY(Direction d, double y)
	{
		double _fy = y;
		if(d == Direction.DOWN)
		{
			_fy--;
		}
		if(d == Direction.UP)
		{
			_fy++;
		}
		return _fy;
	}
	public double getForwardZ()
	{
		return this.getForwardZ(this.getDirection(), this.z);
	}
	public double getForwardZ(Direction d, double z)
	{
		double _fz = z;
		if(d == Direction.NORTH)
		{
			_fz--;
		}
		if(d == Direction.SOUTH)
		{
			_fz++;
		}
		return _fz;
	}

	
	//
	//	Ist an der aktuellen Stelle ein Block?
	//
	public boolean isFilled()
	{
		return !this.isEmpty();
	}
	public boolean isFilled(Block b)
	{
		return !this.isEmpty(b);
	}
	public boolean isFilled(BlockPos bp)
	{
		return !this.isEmpty(bp);
	}
	public boolean isFilled(double x, double y, double z)
	{
		return !this.isEmpty(x, y, z);
	}


	//
	//	Ist an der aktuellen Stelle frei?
	//
	public boolean isEmpty()
	{
		return this.isEmpty(this.x, this.y, this.z);
	}
	public boolean isEmpty(Block b)
	{
		return (b == Blocks.AIR) || (b == Blocks.CAVE_AIR) || (b == Blocks.VOID_AIR);
	}
	public boolean isEmpty(BlockPos bp)
	{
		return this.isEmpty(this.getBlock(bp));
	}
	public boolean isEmpty(double x, double y, double z)
	{
		Block _b = this.getBlock(x, y, z);
		return this.isEmpty(_b);
	}


	//
	//	privater Konstruktor:
	//
	private BlockWorldUtils(LevelAccessor level)
	{
		this.level = level;
	}
}
