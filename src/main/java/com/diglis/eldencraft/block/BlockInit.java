package com.diglis.eldencraft.block;

import com.diglis.eldencraft.EldenCraft;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            EldenCraft.MOD_ID);

    public static final RegistryObject<Block> CARBON_RUNOFF = BLOCKS.register("carbon_runoff",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
                    .strength(3.8f, 4.8f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> NATURAL_GEODE = BLOCKS.register("natural_geode",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
                    .strength(3.8f, 4.8f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> CRYSTAL_ORE = BLOCKS.register("crystal_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY)
                    .strength(2.3f, 3.3f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block",
            () -> new Block(AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_GRAY)
                    .strength(3.8f, 4.8f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.METAL)));

        public static final RegistryObject<Block> SAGE_BLOCK = BLOCKS.register("sage_block",
            () -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.COLOR_GRAY)
                    .strength(3.8f, 4.8f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.METAL)));

}
