package woodconverter;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ScrollInfo.MOD_ID, name = ScrollInfo.NAME, version = ScrollInfo.VERSION, acceptedMinecraftVersions = ScrollInfo.ACCEPTED_VERSIONS)
public class Main {

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		ScrollCraft.init();
	}
}
