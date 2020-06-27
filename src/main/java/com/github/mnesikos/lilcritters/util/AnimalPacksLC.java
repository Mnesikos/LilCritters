package com.github.mnesikos.lilcritters.util;

import com.github.mnesikos.lilcritters.entity.*;
import net.minecraft.util.ResourceLocation;
import org.zawamod.ZAWAMain;
import org.zawamod.entity.core.AnimalPack;

public class AnimalPacksLC {
    public static final AnimalPack BANDED_PENGUIN = ZAWAMain.registerPack(EntityBandedPenguin.class, new ResourceLocation(Ref.MODID, "data/animal/banded_penguin.json")).applyVariantSetup();
    public static final AnimalPack BOX_TURTLE = ZAWAMain.registerPack(EntityBoxTurtle.class, new ResourceLocation(Ref.MODID, "data/animal/box_turtle.json")).applyVariantSetup();
    public static final AnimalPack DWARF_CROC = ZAWAMain.registerPack(EntityDwarfCrocodile.class, new ResourceLocation(Ref.MODID, "data/animal/dwarf_crocodile.json")).applyVariantSetup();
    public static final AnimalPack OPOSSUM = ZAWAMain.registerPack(EntityOpossum.class, new ResourceLocation(Ref.MODID, "data/animal/opossum.json")).applyVariantSetup();
    public static final AnimalPack RACCOON = ZAWAMain.registerPack(EntityRaccoon.class, new ResourceLocation(Ref.MODID, "data/animal/raccoon.json")).applyVariantSetup();
    public static final AnimalPack SKUNK = ZAWAMain.registerPack(EntitySkunk.class, new ResourceLocation(Ref.MODID, "data/animal/skunk.json")).applyVariantSetup();
    public static final AnimalPack SMALL_CLAWED_OTTER = ZAWAMain.registerPack(EntitySmallClawedOtter.class, new ResourceLocation(Ref.MODID, "data/animal/small_clawed_otter.json")).applyVariantSetup();
    public static final AnimalPack TREE_SQUIRREL = ZAWAMain.registerPack(EntityTreeSquirrel.class, new ResourceLocation(Ref.MODID, "data/animal/tree_squirrel.json")).applyVariantSetup();
    public static final AnimalPack TUFTED_DEER = ZAWAMain.registerPack(EntityTuftedDeer.class, new ResourceLocation(Ref.MODID, "data/animal/tufted_deer.json")).applyVariantSetup();
}
