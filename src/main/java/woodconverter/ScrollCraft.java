package woodconverter;

import net.minecraft.block.BlockDoor;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ScrollCraft {

	public static void init() 
	{	
		
		//-Planks
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 2), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 1)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 3), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 2)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 4), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 3)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 5), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 4)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PLANKS, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.PLANKS, 9, 5)
			);
		
		//-Stairs
		GameRegistry.addRecipe(new ItemStack(Blocks.SPRUCE_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.OAK_STAIRS, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.BIRCH_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SPRUCE_STAIRS, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.JUNGLE_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.BIRCH_STAIRS, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.ACACIA_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.JUNGLE_STAIRS, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.DARK_OAK_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.ACACIA_STAIRS, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.OAK_STAIRS, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.DARK_OAK_STAIRS, 9)
			);
		
		//-Logs
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 9, 2), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG, 9, 1)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 9, 3), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG, 9, 2)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG, 9, 3)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG2, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG2, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LOG, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LOG2, 9, 1)
			);
		
		//-Slabs
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 2), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 1)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 3), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 2)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 4), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 3)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 5), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 4)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.WOODEN_SLAB, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.WOODEN_SLAB, 9, 5)
			);
		
		//Fence
		GameRegistry.addRecipe(new ItemStack(Blocks.SPRUCE_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.OAK_FENCE, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.BIRCH_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SPRUCE_FENCE, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.JUNGLE_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.BIRCH_FENCE, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.ACACIA_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.JUNGLE_FENCE, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.DARK_OAK_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.ACACIA_FENCE, 9)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.OAK_FENCE, 9), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.DARK_OAK_FENCE, 9)
			);
		
		//-Leaves
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES, 9, 2), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES, 9, 1)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES, 9, 3), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES, 9, 2)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES2, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES, 9, 3)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES2, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES2, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.LEAVES, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.LEAVES2, 9, 1)
			);
		
		//Saplings
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 1), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 0)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 2), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 1)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 3), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 2)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 4), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 3)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 5), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 4)
			);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.SAPLING, 9, 0), 
				"AAA",
				"AAA",
				"AAA",
				'A', new ItemStack(Blocks.SAPLING, 9, 5)
			);
		
		//-Plank - Log
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 1, 0), new ItemStack(Blocks.PLANKS, 1, 0), new ItemStack(Blocks.PLANKS, 1, 0),
				new ItemStack(Blocks.PLANKS, 1, 0), new ItemStack(Blocks.PLANKS, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 1, 1), new ItemStack(Blocks.PLANKS, 1, 1), new ItemStack(Blocks.PLANKS, 1, 1),
				new ItemStack(Blocks.PLANKS, 1, 1), new ItemStack(Blocks.PLANKS, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 1, 2), new ItemStack(Blocks.PLANKS, 1, 2), new ItemStack(Blocks.PLANKS, 1, 2),
				new ItemStack(Blocks.PLANKS, 1, 2), new ItemStack(Blocks.PLANKS, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 1, 3), new ItemStack(Blocks.PLANKS, 1, 3), new ItemStack(Blocks.PLANKS, 1, 3),
				new ItemStack(Blocks.PLANKS, 1, 3), new ItemStack(Blocks.PLANKS, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 1, 0), new ItemStack(Blocks.PLANKS, 1, 4), new ItemStack(Blocks.PLANKS, 1, 4),
				new ItemStack(Blocks.PLANKS, 1, 4), new ItemStack(Blocks.PLANKS, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 1, 1), new ItemStack(Blocks.PLANKS, 1, 5), new ItemStack(Blocks.PLANKS, 1, 5),
				new ItemStack(Blocks.PLANKS, 1, 5), new ItemStack(Blocks.PLANKS, 1, 5));
		
		//Door
		GameRegistry.addShapelessRecipe(new ItemStack(Items.SPRUCE_DOOR, 3), new ItemStack(Items.OAK_DOOR), new ItemStack(Items.OAK_DOOR),
				new ItemStack(Items.OAK_DOOR));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.BIRCH_DOOR, 3), new ItemStack(Items.SPRUCE_DOOR), new ItemStack(Items.SPRUCE_DOOR),
				new ItemStack(Items.SPRUCE_DOOR));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.JUNGLE_DOOR, 3), new ItemStack(Items.BIRCH_DOOR), new ItemStack(Items.BIRCH_DOOR),
				new ItemStack(Items.BIRCH_DOOR));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ACACIA_DOOR, 3), new ItemStack(Items.JUNGLE_DOOR), new ItemStack(Items.JUNGLE_DOOR),
				new ItemStack(Items.JUNGLE_DOOR));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DARK_OAK_DOOR, 3), new ItemStack(Items.ACACIA_DOOR), new ItemStack(Items.ACACIA_DOOR),
				new ItemStack(Items.ACACIA_DOOR));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.OAK_DOOR, 3), new ItemStack(Items.DARK_OAK_DOOR), new ItemStack(Items.DARK_OAK_DOOR),
				new ItemStack(Items.DARK_OAK_DOOR));
		
		//Fence Gate
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.SPRUCE_FENCE_GATE, 3), new ItemStack(Blocks.OAK_FENCE_GATE), new ItemStack(Blocks.OAK_FENCE_GATE),
				new ItemStack(Blocks.OAK_FENCE_GATE));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.BIRCH_FENCE_GATE, 3), new ItemStack(Blocks.SPRUCE_FENCE_GATE), new ItemStack(Blocks.SPRUCE_FENCE_GATE),
				new ItemStack(Blocks.SPRUCE_FENCE_GATE));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.JUNGLE_FENCE_GATE, 3), new ItemStack(Blocks.BIRCH_FENCE_GATE), new ItemStack(Blocks.BIRCH_FENCE_GATE),
				new ItemStack(Blocks.BIRCH_FENCE_GATE));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ACACIA_FENCE_GATE, 3), new ItemStack(Blocks.JUNGLE_FENCE_GATE), new ItemStack(Blocks.JUNGLE_FENCE_GATE),
				new ItemStack(Blocks.JUNGLE_FENCE_GATE));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DARK_OAK_FENCE_GATE, 3), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(Blocks.ACACIA_FENCE_GATE),
				new ItemStack(Blocks.ACACIA_FENCE_GATE));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OAK_FENCE_GATE, 3), new ItemStack(Blocks.DARK_OAK_FENCE_GATE), new ItemStack(Blocks.DARK_OAK_FENCE_GATE),
				new ItemStack(Blocks.DARK_OAK_FENCE_GATE));

	}
}
