package net.atoms.valorant.util;

import net.atoms.valorant.Main;
import net.atoms.valorant.blocks.BlockList;
import net.atoms.valorant.blocks.BlockModel;
import net.atoms.valorant.items.ItemModel;
import net.atoms.valorant.items.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class RegisterHandler
{
	
	//Register
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MOD_ID);

	//items
	public static final RegistryObject<Item> test_item = ITEMS.register("hamburger", ItemModel::new);

	//blocks
	public static final RegistryObject<Block> test_block = BLOCKS.register(
			new ResourceLocation(Main.MOD_ID,"ore").getPath(), BlockList::new);

	//blocks item
	public static final RegistryObject<Item> test_block_item = ITEMS.register(
			new ResourceLocation(Main.MOD_ID,"ore").getPath(), ()->new BlockModel(test_block.get()));


	//init func
	public static void init()
	{
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

}
