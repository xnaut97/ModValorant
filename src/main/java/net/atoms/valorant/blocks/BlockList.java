package net.atoms.valorant.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlockList extends Block
{
    public BlockList()
    {
        super
        (
                Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,3.0f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
                //0 = wooden, 1 = stone & gold, 2 = iron, 3=diamond
                .sound(SoundType.STONE)

        );

    }
}
