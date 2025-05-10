package com.github.mnesikos.lilcritters.client.model;

import com.github.mnesikos.lilcritters.LilCritters;
import com.github.mnesikos.lilcritters.client.render.entity.BullfrogRenderer;
import com.google.common.collect.Sets;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Tuple;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.zawamod.zawa.client.model.ZawaFrogBaseModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@OnlyIn(Dist.CLIENT)
public class LCModelLayers {
    public static final Set<ModelLayerLocation> ALL_MODELS = Sets.newHashSet();
    public static final List<Tuple<ModelLayerLocation, Supplier<LayerDefinition>>> MODEL_LAYERS_LIST = new ArrayList<>();
    public static final ModelLayerLocation BANDED_PENGUIN = register("banded_penguin", BandedPenguinModel::createBodyLayer);
    public static final ModelLayerLocation BOX_TURTLE = register("box_turtle", BoxTurtleModel::createBodyLayer);
    public static final ModelLayerLocation BULLFROG_ADULT = register("bullfrog", "adult", LargeFrogModel::createBodyLayer);
    public static final ModelLayerLocation BULLFROG_CHILD = register("bullfrog", "child", ZawaFrogBaseModel.Tadpole::createBodyLayer);
    public static final ModelLayerLocation CAPYBARA_ADULT = register("capybara", "adult", CapybaraModel.Adult::createBodyLayer);
    public static final ModelLayerLocation CAPYBARA_CHILD = register("capybara", "child", CapybaraModel.Child::createBodyLayer);
    public static final ModelLayerLocation DART_FROG_ADULT = register("dart_frog", "adult", SmallFrogModel::createBodyLayer);
    public static final ModelLayerLocation DART_FROG_CHILD = register("dart_frog", "child", ZawaFrogBaseModel.Tadpole::createBodyLayer);
    public static final ModelLayerLocation DWARF_CROCODILE = register("dwarf_crocodile", DwarfCrocodileModel::createBodyLayer);
    public static final ModelLayerLocation GUINEA_PIG = register("guinea_pig", GuineaPigModel::createBodyLayer);
    public static final ModelLayerLocation MYSTERY_SNAIL = register("mystery_snail", MysterySnailModel::createBodyLayer);
    public static final ModelLayerLocation OPOSSUM_ADULT = register("opossum", "adult", OpossumModel.Adult::createBodyLayer);
    public static final ModelLayerLocation OPOSSUM_CHILD = register("opossum", "child", OpossumModel.Child::createBodyLayer);
    public static final ModelLayerLocation PACMAN_FROG_ADULT = register("pacman_frog", "adult", LargeFrogModel::createBodyLayer);
    public static final ModelLayerLocation PACMAN_FROG_CHILD = register("pacman_frog", "child", ZawaFrogBaseModel.Tadpole::createBodyLayer);
    public static final ModelLayerLocation POND_SLIDER = register("pond_slider", PondSliderModel::createBodyLayer);
    public static final ModelLayerLocation PUMPKIN_TOADLET = register("pumpkin_toadlet", SmallFrogModel::createBodyLayer);
    public static final ModelLayerLocation RACCOON = register("raccoon", RaccoonModel::createBodyLayer);
    public static final ModelLayerLocation SKUNK = register("skunk", SkunkModel::createBodyLayer);
    public static final ModelLayerLocation SMALL_CLAWED_OTTER = register("small_clawed_otter", SmallClawedOtterModel::createBodyLayer);
    public static final ModelLayerLocation TOMATO_FROG_ADULT = register("tomato_frog", "adult", LargeFrogModel::createBodyLayer);
    public static final ModelLayerLocation TOMATO_FROG_CHILD = register("tomato_frog", "child", ZawaFrogBaseModel.Tadpole::createBodyLayer);
    public static final ModelLayerLocation TREE_MONITOR = register("tree_monitor", TreeMonitorModel::createBodyLayer);
    public static final ModelLayerLocation TREE_SQUIRREL = register("tree_squirrel", TreeSquirrelModel::createBodyLayer);
    public static final ModelLayerLocation TUFTED_DEER_ADULT = register("tufted_deer", "adult", TuftedDeerModel.Adult::createBodyLayer);
    public static final ModelLayerLocation TUFTED_DEER_CHILD = register("tufted_deer", "child", TuftedDeerModel.Child::createBodyLayer);

    public LCModelLayers() {
    }

    private static ModelLayerLocation register(String path, Supplier<LayerDefinition> layerDefinition) {
        return register(path, "main", layerDefinition);
    }

    private static ModelLayerLocation register(String path, String model, Supplier<LayerDefinition> layerDefinition) {
        ModelLayerLocation modellayerlocation = createLocation(path, model);
        MODEL_LAYERS_LIST.add(new Tuple<>(modellayerlocation, layerDefinition));
        if (!ALL_MODELS.add(modellayerlocation))
            throw new IllegalStateException("Duplicate registration for " + modellayerlocation);
        else return modellayerlocation;
    }

    private static ModelLayerLocation createLocation(String path, String model) {
        return new ModelLayerLocation(new ResourceLocation(LilCritters.MOD_ID, path), model);
    }
}
