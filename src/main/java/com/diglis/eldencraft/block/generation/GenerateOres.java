package com.diglis.eldencraft.block.generation;

import com.diglis.eldencraft.block.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class GenerateOres {

    public static void addOres(final BiomeLoadingEvent event) {
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                BlockInit.NATURAL_GEODE.get().defaultBlockState(), 4, 11, 48, 20);

        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                BlockInit.CARBON_RUNOFF.get().defaultBlockState(), 20, 32, 62, 24);

    }

    public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize))
                        .decorated(Placement.RANGE.configured(
                                new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared().count(amount));
    }

}
