package net.atoms.valorant.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockModel extends BlockItem
{

    public BlockModel(Block block) {
        super(block,new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
