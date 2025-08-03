package com.github.mnesikos.lilcritters.data;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.entity.LCEntities;
import com.github.mnesikos.lilcritters.item.LCItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.zawamod.zawa.tags.ZawaEntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class LCTagsProviders {
    public static class LCEntityTypeTagsProvider extends EntityTypeTagsProvider {
        public LCEntityTypeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, LilCritters.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(ZawaEntityTypeTags.SPECIES_VARIANTS).add(
                    LCEntities.BANDED_PENGUIN.get(),
                    LCEntities.BOX_TURTLE.get(),
                    LCEntities.BULLFROG.get(),
                    LCEntities.FRUIT_BAT.get(),
                    LCEntities.OPOSSUM.get(),
                    LCEntities.SKUNK.get(),
                    LCEntities.SNAPPING_TURTLE.get(),
                    LCEntities.TREE_SQUIRREL.get()
            );
            tag(ZawaEntityTypeTags.ZOO_ANIMALS).add(
                    LCEntities.AMERICAN_BADGER.get(),
                    LCEntities.BANDED_PENGUIN.get(),
                    LCEntities.BEARDED_DRAGON.get(),
                    LCEntities.BOX_TURTLE.get(),
                    LCEntities.BULLFROG.get(),
                    LCEntities.BURROWING_OWL.get(),
                    LCEntities.CAPYBARA.get(),
                    LCEntities.DART_FROG.get(),
                    LCEntities.DWARF_CROCODILE.get(),
                    LCEntities.FRUIT_BAT.get(),
                    LCEntities.GUINEA_PIG.get(),
                    LCEntities.OPOSSUM.get(),
                    LCEntities.PACMAN_FROG.get(),
                    LCEntities.POND_SLIDER.get(),
                    LCEntities.PRAIRIE_DOG.get(),
                    LCEntities.PUMPKIN_TOADLET.get(),
                    LCEntities.RACCOON.get(),
                    LCEntities.SKUNK.get(),
                    LCEntities.SMALL_CLAWED_OTTER.get(),
                    LCEntities.SNAPPING_TURTLE.get(),
                    LCEntities.SUGAR_GLIDER.get(),
                    LCEntities.TOMATO_FROG.get(),
                    LCEntities.TREE_MONITOR.get(),
                    LCEntities.TREE_SQUIRREL.get(),
                    LCEntities.TUFTED_DEER.get()
            );
        }
    }

    public static class LCBlockTagsProvider extends BlockTagsProvider {
        public LCBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, LilCritters.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {

        }
    }

    public static class LCItemTagsProvider extends ItemTagsProvider {
        public LCItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider tagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(packOutput, lookupProvider, tagsProvider.contentsGetter(), LilCritters.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            tag(Tags.Items.EGGS).add(
                    LCItems.BANDED_PENGUIN_EGG.get(),
                    LCItems.BEARDED_DRAGON_EGG.get(),
                    LCItems.BOX_TURTLE_EGG.get(),
                    LCItems.BURROWING_OWL_EGG.get(),
                    LCItems.DWARF_CROCODILE_EGG.get(),
                    LCItems.POND_SLIDER_EGG.get(),
                    LCItems.PUMPKIN_TOADLET_EGG.get(),
                    LCItems.SNAPPING_TURTLE_EGG.get(),
                    LCItems.TREE_MONITOR_EGG.get()
            );
        }
    }
}
