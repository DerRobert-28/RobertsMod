package der.robert.Custom;
//
//	CUSTOM
//
import der.robert.Custom.LanguageCandy;
//import der.robert.Custom.ObjectStack;
//
//	JAVA
//
import java.lang.reflect.*;
import java.util.concurrent.atomic.AtomicReference;
//
//	JAVAX
//
import javax.annotation.Nullable;
//
//	MINECRAFT
//
import net.minecraft.commands.Commands;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.levelgen.WorldOptions;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
//
//	MINECRAFT-FORGE
//
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.registries.RegistryObject;
//
//
public class BlockWorldUtils
{
	//
	//	Lokale Welt-Daten:
	//
	private final LevelAccessor level;
	private double x, y, z;
	private Vec3 vector = null;
	private CommandSourceStack sourceStack = null;

	//
	//	Generiere Zugriff auf aktuelle Welt:
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
		this.setLocation(x, y, z);
		return this;
	}


	//
	//	Convert to Block (or AIR if impossible):
	//
	public BlockState convertToState(Item item)
	{
		if(item instanceof BlockItem $item)
		{
			return $item.getBlock().defaultBlockState();
		}
		return Blocks.AIR.defaultBlockState();
	}
	public BlockState convertToState(ItemStack stack)
	{
		Item _item = stack.getItem();
		return this.convertToState(_item);
	}

	
	public CommandSourceStack useSourceStack()
	{
		CommandSourceStack _stack = this.sourceStack;
		if(_stack == null)
		{
			// WIP
		}
		return _stack;
	}
	
	//
	//	Führe einen Befehl aus:
	//
	public boolean execute(String chatCommand)
	{
		Commands _cmd = this.getCommands();
		if(_cmd == null)
		{
			return false;
		}
		_cmd.performPrefixedCommand
		(
			this.sourceStack.withSuppressedOutput(),
			chatCommand
		);
		return true;
	}


	//
	//	hole einen Block (direkt):
	//
	public Block getBlock()
	{
		return this.getState().getBlock();
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
	public Block getBlock(double x, double y, double z)
	{
		return this.getState(x, y, z).getBlock();
	}


	//
	//	hole Block HINTER aktuellem:
	//
	public BlockPos getBlockBehind()
	{
		return this.getBlockBehind(this.x, this.y, this.z, this.getDirection());
	}
	public BlockPos getBlockBehind(double x, double y, double z, Direction dir)
	{
		double _bx = this.getX_ofBack(x, dir);
		double _by = this.getY_ofBack(y, dir);
		double _bz = this.getZ_ofBack(z, dir);
		return this.getPosition(_bx, _by, _bz);
	}


	//
	//	hole Block VOR aktuellem:
	//
	public BlockPos getBlockInFront()
	{
		return this.getBlockInFront(this.x, this.y, this.z, this.getDirection());
	}
	public BlockPos getBlockInFront(double x, double y, double z, Direction dir)
	{
		double _fx = this.getX_ofFront(x, dir);
		double _fy = this.getY_ofFront(y, dir);
		double _fz = this.getZ_ofFront(z, dir);
		return this.getPosition(_fx, _fy, _fz);
	}


	//
	//	Hole Befehlsliste
	//
	@Nullable
	public Commands getCommands()
	{
		MinecraftServer _server = this.getServer();
		if(_server == null)
		{
			return null;
		}
		return _server.getCommands();
	}


	//
	//	hole einen Custom Block:
	//
	public BlockState getCustom(RegistryObject<Block> reg)
	{
		return reg.get().defaultBlockState();
	}


	//
	//	hole Blickrichtung:
	//
	public Direction getDirection()
	{
		BlockState _bs = this.getState();
		return this.getDirection(_bs);
	}
	public Direction getDirection(BlockState state)
	{
		Property<?> _property = this
			.getBlock(state)
			.getStateDefinition()
			.getProperty("facing");
		//
		//	Blickrichtung kann direkt geholt werden:
		//
		if(_property != null && state.getValue(_property) instanceof Direction $dir)
		{
			return $dir;
		}
		//
		//	Blickrichtung nach oben oder unten:
		//
		if(state.hasProperty(BlockStateProperties.AXIS))
		{
			return Direction.fromAxisAndDirection
			(
				state.getValue(BlockStateProperties.AXIS),
				Direction.AxisDirection.POSITIVE
			);
		}
		//
		//	Blickrichtung zur Seite:
		//
		if(state.hasProperty(BlockStateProperties.HORIZONTAL_AXIS))
		{
			return Direction.fromAxisAndDirection
			(
				state.getValue(BlockStateProperties.HORIZONTAL_AXIS),
				Direction.AxisDirection.POSITIVE
			);
		}
		//
		//	Im Zweifel schaut der Block immer nach Norden:
		//
		return Direction.NORTH;
	}
	public Direction getDirection(double x, double y, double z)
	{
		BlockState _state = this.getState(x, y, z);
		return this.getDirection(_state);
	}


	//
	//	hole Block als Entity:
	//
	public BlockEntity getEntity(BlockPos pos)
	{
		return level.getBlockEntity(pos);

	}
	public BlockEntity getEntity(double x, double y, double z)
	{
		BlockPos _pos = this.getPosition(x, y, z);
		return level.getBlockEntity(_pos);
	}


	//
	//	hole Block als Position:
	//
	public BlockPos getPosition()
	{
		return BlockPos.containing((int)(this.x), (int)(this.y), (int)(this.z));
	}
	public BlockPos getPosition(double x, double y, double z)
	{
		return BlockPos.containing((int)x, (int)y, (int)z);
	}


	//
	//	Hole den World-Seed:
	//
	@Nullable
	public Long getSeed()
	{
		MinecraftServer _server = this.getServer();
		if(_server == null) return null;
		//
		return _server.getWorldData().worldGenOptions().seed();
	}


	//
	//	Setze den World-Seed:
	//
	public boolean setSeed(long theSeed)
	{
		try
		{	
			MinecraftServer _server = this.getServer();
			WorldOptions _options = _server.getWorldData().worldGenOptions();
			//
			Field _seedField = WorldOptions.class.getField("seed");
			_seedField.setAccessible(true);
			Field _modifiersField = Field.class.getDeclaredField("modifiers");
			_modifiersField.setAccessible(true);
			_modifiersField.setInt(_seedField, _seedField.getModifiers() & ~Modifier.FINAL);
			_seedField.set(null, theSeed);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	//
	//	Hole den Weltserver
	//
	@Nullable
	public MinecraftServer getServer()
	{
		ServerLevel _level = this.getServerLevel();
		if(_level == null)
		{
			return null;
		}
		return _level.getServer();
	}


	//
	//	Hole das Weltserver-Level
	//
	@Nullable
	public ServerLevel getServerLevel()
	{
		if(this.level instanceof ServerLevel _level)
		{
			return _level;
		}
		return null;
	}


	//
	//	Hole die Anzahl der Slots eines Containers:
	//
	public int getSlotCount(BlockPos pos) {
		Variant _variant = Variant.use();
		BlockEntity _entity = this.getEntity(pos);
		//
		if(_entity == null) return 0;
		//
		_entity
			.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
			.ifPresent($capability -> _variant.set($capability.getSlots()));		
		return _variant.get();
	}
	public int getSlotCount(double x, double y, double z) {
		BlockPos _pos = this.getPosition(x, y, z);
		return this.getSlotCount(_pos);
	}


	//
	//	Hole Stack in Slot:
	//
	public ItemStack getStack(BlockPos pos, int slot) {
		AtomicReference<ItemStack> _stack = new AtomicReference<>(ItemStack.EMPTY);
		BlockEntity _entity = this.getEntity(pos);
		//
		if(_entity == null) return ItemStack.EMPTY;
		//
		_entity
			.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
			.ifPresent($capability -> _stack.set($capability.getStackInSlot(slot)));		
		return _stack.get();		
	}
	public ItemStack getStack(double x, double y, double z, int slot) {
		BlockPos _pos = this.getPosition(x, y, z);
		return this.getStack(_pos, slot);
	}


	//
	//	Alternativname für getSlotCount()
	//
	public int getSlotNumber(BlockPos pos) {
		return getSlotCount(pos);
	}
	public int getSlotNumber(double x, double y, double z) {
		return getSlotCount(x, y, z);
	}


	//
	//	Hole Block als Status:
	//
	public BlockState getState() {
		BlockPos _bp = this.getPosition();
		return this.getState(_bp);
		
	}
	public BlockState getState(BlockPos bp) {
		return this.level.getBlockState(bp);
	}
	public BlockState getState(double x, double y, double z) {
		BlockPos _bp = this.getPosition(x, y, z);
		return this.getState(_bp);
	}


	//
	//	hole X-Koordinate von hinterem/vorderen Block:
	//
	public double getX_ofBack() {
		return this.getX_ofBack(this.x, this.getDirection());
	}
	public double getX_ofBack(double x, Direction dir) {
		double _bx = x;
		if(dir == Direction.EAST) _bx--;
		if(dir == Direction.WEST) _bx++;
		return _bx;
	}
	public double getX_ofFront() {
		return this.getX_ofFront(this.x, this.getDirection());
	}
	public double getX_ofFront(double x, Direction dir) {
		double _fx = x;
		if(dir == Direction.EAST) _fx++;
		if(dir == Direction.WEST) _fx--;
		return _fx;
	}


	//
	//	hole Y-Koordinate von hinterem/vorderen Block:
	//
	public double getY_ofBack() {
		return this.getY_ofBack(this.y, this.getDirection());
	}
	public double getY_ofBack(double y, Direction dir) {
		double _by = y;
		if(dir == Direction.DOWN) _by++;
		if(dir == Direction.UP) _by--;
		return _by;
	}
	public double getY_ofFront() {
		return this.getY_ofFront(this.y, this.getDirection());
	}
	public double getY_ofFront(double y, Direction dir) {
		double _fy = y;
		if(dir == Direction.DOWN) _fy--;
		if(dir == Direction.UP) _fy++;
		return _fy;
	}

	
	//
	//	hole Z-Koordinate von hinterem/vorderen Block:
	//
	public double getZ_ofBack() {
		return this.getZ_ofBack(this.z, this.getDirection());
	}
	public double getZ_ofBack(double z, Direction dir) {
		double _bz = z;
		if(dir == Direction.NORTH) _bz++;
		if(dir == Direction.SOUTH) _bz--;
		return _bz;
	}
	public double getZ_ofFront() {
		return this.getZ_ofFront(this.z, this.getDirection());
	}
	public double getZ_ofFront(double z, Direction dir) {
		double _fz = z;
		if(dir == Direction.NORTH) _fz--;
		if(dir == Direction.SOUTH) _fz++;
		return _fz;
	}


	//
	//	Ist an der aktuellen Stelle frei?
	//
	public boolean isEmpty() {
		return this.isEmpty(this.x, this.y, this.z);
	}
	public boolean isEmpty(Block block) {
		return (block == Blocks.AIR)
			|| (block == Blocks.CAVE_AIR)
			|| (block == Blocks.VOID_AIR);
	}
	public boolean isEmpty(BlockPos pos) {
		return this.isEmpty(this.getBlock(pos));
	}
	public boolean isEmpty(double x, double y, double z) {
		Block _block = this.getBlock(x, y, z);
		return this.isEmpty(_block);
	}

	
	//
	//	Ist an der aktuellen Stelle ein Block?
	//
	public boolean isFilled() {
		boolean _empty = this.isEmpty();
		return LanguageCandy.NOT(_empty);
	}
	public boolean isFilled(Block block) {
		boolean _empty = this.isEmpty(block);
		return LanguageCandy.NOT(_empty);
	}
	public boolean isFilled(BlockPos pos) {
		boolean _empty = this.isEmpty(pos);
		return LanguageCandy.NOT(_empty);
	}
	public boolean isFilled(double x, double y, double z) {
		boolean _empty = this.isEmpty(x, y, z);
		return LanguageCandy.NOT(_empty);
	}

	
	//
	//	directly locate world position:
	//
	public void locate(double x, double y, double z) {
		this.setLocation(x, y, z);
	}


	//
	//	Remove items from slot and return success:
	//
	public boolean removeStack(BlockPos pos, int slot, int count) {
		AtomicReference<ItemStack> _stack = new AtomicReference<>(ItemStack.EMPTY);
		BlockEntity _entity = this.getEntity(pos);
		//
		if(_entity == null) return false;
		//
		_entity
			.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
			.ifPresent($capability ->
				_stack.set(
					$capability.extractItem(slot, count, false)
				)
			);
		ItemStack _get = _stack.get();
		return (_get != null) && (_get != ItemStack.EMPTY);
	}
	public boolean removeStack(double x, double y, double z, int slot, int count) {
		BlockPos _pos = this.getPosition(x, y, z);
		return this.removeStack(_pos, slot, count);
	}


	//
	//	setze einen Block:
	//
	public boolean setBlock(BlockPos pos, BlockState state) {
		return this.level.setBlock(pos, state, 3);
	}
	public boolean setBlock(double x, double y, double z, BlockState state) {
		return this.level.setBlock(this.getPosition(x, y, z), state, 3);
	}


	//
	//	set world location/position:
	//
	public void setLocation(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.vector = new Vec3(x, y, z);
		this.sourceStack = new CommandSourceStack(
			CommandSource.NULL,
			this.vector,
			Vec2.ZERO,
			this.getServerLevel(),
			4,
			"",
			Component.literal(""),
			this.getServer(),
			null
		);
	}


	//
	//	privater Konstruktor:
	//
	private BlockWorldUtils(LevelAccessor level) {
		this.level = level;
	}
}
