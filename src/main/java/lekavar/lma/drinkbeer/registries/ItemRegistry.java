package lekavar.lma.drinkbeer.registries;

import lekavar.lma.drinkbeer.DrinkBeer;
import lekavar.lma.drinkbeer.blocks.SpiceBlock;
import lekavar.lma.drinkbeer.effects.DrunkFrostWalkerStatusEffect;
import lekavar.lma.drinkbeer.gui.BartendingTableContainerScreen;
import lekavar.lma.drinkbeer.gui.BeerBarrelContainerScreen;
import lekavar.lma.drinkbeer.items.BeerMugItem;
import lekavar.lma.drinkbeer.items.MixedBeerBlockItem;
import lekavar.lma.drinkbeer.items.SpiceBlockItem;
import lekavar.lma.drinkbeer.utils.ModCreativeTab;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DrinkBeer.MOD_ID);

    //general
    public static final RegistryObject<Item> BEER_BARREL = ITEMS.register("beer_barrel", () -> new BlockItem(BlockRegistry.BEER_BARREL.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));
    public static final RegistryObject<Item> BARTENDING_TABLE = ITEMS.register("bartending_table_normal", () -> new BlockItem(BlockRegistry.BARTENDING_TABLE.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));
    public static final RegistryObject<Item> TRADE_BOX = ITEMS.register("trade_box_normal", () -> new BlockItem(BlockRegistry.TRADE_BOX.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));
    public static final RegistryObject<Item> EMPTY_BEER_MUG = ITEMS.register("empty_beer_mug", () -> new BlockItem(BlockRegistry.EMPTY_BEER_MUG.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));

    public static final RegistryObject<Item> IRON_CALL_BELL = ITEMS.register("iron_call_bell", () -> new BlockItem(BlockRegistry.IRON_CALL_BELL.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));
    public static final RegistryObject<Item> GOLDEN_CALL_BELL = ITEMS.register("golden_call_bell", () -> new BlockItem(BlockRegistry.GOLDEN_CALL_BELL.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));
    public static final RegistryObject<Item> LEKAS_CALL_BELL = ITEMS.register("lekas_call_bell", () -> new BlockItem(BlockRegistry.LEKAS_CALL_BELL.get(), new Item.Properties().tab(ModCreativeTab.GENERAL)));

    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG = ITEMS.register("recipe_board_beer_mug", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_BLAZE_STOUT = ITEMS.register("recipe_board_beer_mug_blaze_stout", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_BLAZE_STOUT.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_BLAZE_MILK_STOUT = ITEMS.register("recipe_board_beer_mug_blaze_milk_stout", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_BLAZE_MILK_STOUT.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_APPLE_LAMBIC = ITEMS.register("recipe_board_beer_mug_apple_lambic", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_APPLE_LAMBIC.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_SWEET_BERRY_KRIEK = ITEMS.register("recipe_board_beer_mug_sweet_berry_kriek", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_SWEET_BERRY_KRIEK.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_HAARS_ICY_PALE_LAGER = ITEMS.register("recipe_board_beer_mug_haars_icy_pale_lager", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_HAARS_ICY_PALE_LAGER.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_PUMPKIN_KVASS = ITEMS.register("recipe_board_beer_mug_pumpkin_kvass", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_PUMPKIN_KVASS.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_NIGHT_HOWL_KVASS = ITEMS.register("recipe_board_beer_mug_night_howl_kvass", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_NIGHT_HOWL_KVASS.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_FROTHY_PINK_EGGNOG = ITEMS.register("recipe_board_beer_mug_frothy_pink_eggnog", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_FROTHY_PINK_EGGNOG.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_WITHER_STOUT = ITEMS.register("recipe_board_beer_mug_wither_stout", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_WITHER_STOUT.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));
    public static final RegistryObject<Item> RECIPE_BOARD_BEER_MUG_SELTZER = ITEMS.register("recipe_board_beer_mug_seltzer", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_BEER_MUG_SELTZER.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));

    public static final RegistryObject<Item> RECIPE_BOARD_PACKAGE = ITEMS.register("recipe_board_package", () -> new BlockItem(BlockRegistry.RECIPE_BOARD_PACKAGE.get(), new Item.Properties().tab(ModCreativeTab.GENERAL).stacksTo(1)));

    //beer
    public static final RegistryObject<Item> BEER_MUG = ITEMS.register("beer_mug", () -> new BeerMugItem(BlockRegistry.BEER_MUG.get(),  new MobEffectInstance(MobEffects.DIG_SPEED, 1200), 2,true));
    public static final RegistryObject<Item> BEER_MUG_BLAZE_STOUT = ITEMS.register("beer_mug_blaze_stout", () -> new BeerMugItem(BlockRegistry.BEER_MUG_BLAZE_STOUT.get(),  new MobEffectInstance( MobEffects.FIRE_RESISTANCE, 1800),2, true));
    public static final RegistryObject<Item> BEER_MUG_BLAZE_MILK_STOUT = ITEMS.register("beer_mug_blaze_milk_stout", () -> new BeerMugItem(BlockRegistry.BEER_MUG_BLAZE_MILK_STOUT.get(), new MobEffectInstance(  MobEffects.FIRE_RESISTANCE, 2400), 2, true));
    public static final RegistryObject<Item> BEER_MUG_APPLE_LAMBIC = ITEMS.register("beer_mug_apple_lambic", () -> new BeerMugItem(BlockRegistry.BEER_MUG_APPLE_LAMBIC.get(), new MobEffectInstance( MobEffects.REGENERATION, 300),3, true));
    public static final RegistryObject<Item> BEER_MUG_SWEET_BERRY_KRIEK = ITEMS.register("beer_mug_sweet_berry_kriek", () -> new BeerMugItem(BlockRegistry.BEER_MUG_SWEET_BERRY_KRIEK.get(), new MobEffectInstance( MobEffects.REGENERATION, 400), 3, true));
    public static final RegistryObject<Item> BEER_MUG_HAARS_ICY_PALE_LAGER = ITEMS.register("beer_mug_haars_icy_pale_lager", () -> new BeerMugItem(BlockRegistry.BEER_MUG_HAARS_ICY_PALE_LAGER.get(), () -> new MobEffectInstance(MobEffectRegistry.DRUNK_FROST_WALKER.get(), 1200), 1,true));
    public static final RegistryObject<Item> BEER_MUG_PUMPKIN_KVASS = ITEMS.register("beer_mug_pumpkin_kvass", () -> new BeerMugItem(BlockRegistry.BEER_MUG_PUMPKIN_KVASS.get(), 9, false));
    public static final RegistryObject<Item> BEER_MUG_NIGHT_HOWL_KVASS = ITEMS.register("beer_mug_night_howl_kvass", () -> new BeerMugItem(BlockRegistry.BEER_MUG_NIGHT_HOWL_KVASS.get(), 4, true));
    public static final RegistryObject<Item> BEER_MUG_FROTHY_PINK_EGGNOG = ITEMS.register("beer_mug_frothy_pink_eggnog", () -> new BeerMugItem(BlockRegistry.BEER_MUG_FROTHY_PINK_EGGNOG.get(), new MobEffectInstance(MobEffects.ABSORPTION, 2400),2, true));
    public static final RegistryObject<Item> BEER_MUG_WITHER_STOUT = ITEMS.register("beer_mug_wither_stout", () -> new BeerMugItem(BlockRegistry.BEER_MUG_WITHER_STOUT.get(),2, true));
    public static final RegistryObject<Item> BEER_MUG_SELTZER = ITEMS.register("beer_mug_seltzer", () -> new BeerMugItem(BlockRegistry.BEER_MUG_SELTZER.get(),-15, true));
    public static final RegistryObject<Item> MIXED_BEER = ITEMS.register("mixed_beer", () -> new MixedBeerBlockItem(BlockRegistry.MIXED_BEER.get()));

    // Spices
    public static final RegistryObject<Item> SPICE_BLAZE_PAPRIKA = ITEMS.register("spice_blaze_paprika", () -> new SpiceBlockItem(BlockRegistry.SPICE_BLAZE_PAPRIKA.get(), null, 1));
    public static final RegistryObject<Item> SPICE_DRIED_EGLIA_BUD  = ITEMS.register("spice_dried_eglia_bud", () -> new SpiceBlockItem(BlockRegistry.SPICE_DRIED_EGLIA_BUD.get(), null, 1));
    public static final RegistryObject<Item> SPICE_SMOKED_EGLIA_BUD  = ITEMS.register("spice_smoked_eglia_bud",() -> new SpiceBlockItem(BlockRegistry.SPICE_SMOKED_EGLIA_BUD.get(), null, 1));
    public static final RegistryObject<Item> SPICE_AMETHYST_NIGELLA_SEEDS  = ITEMS.register("spice_amethyst_nigella_seeds", () -> new SpiceBlockItem(BlockRegistry.SPICE_AMETHYST_NIGELLA_SEEDS.get(), null, 1));
    public static final RegistryObject<Item> SPICE_CITRINE_NIGELLA_SEEDS  = ITEMS.register("spice_citrine_nigella_seeds", () -> new SpiceBlockItem(BlockRegistry.SPICE_CITRINE_NIGELLA_SEEDS.get(), null, 1));
    public static final RegistryObject<Item> SPICE_ICE_MINT  = ITEMS.register("spice_ice_mint", () -> new SpiceBlockItem(BlockRegistry.SPICE_ICE_MINT.get(), null, 1));
    public static final RegistryObject<Item> SPICE_ICE_PATCHOULI  = ITEMS.register("spice_ice_patchouli", () -> new SpiceBlockItem(BlockRegistry.SPICE_ICE_PATCHOULI.get(), null, 1));
    public static final RegistryObject<Item> SPICE_STORM_SHARDS  = ITEMS.register("spice_storm_shards", () -> new SpiceBlockItem(BlockRegistry.SPICE_STORM_SHARDS.get(), null, 1));
    public static final RegistryObject<Item> SPICE_ROASTED_RED_PINE_NUTS  = ITEMS.register("spice_roasted_red_pine_nuts", () -> new SpiceBlockItem(BlockRegistry.SPICE_ROASTED_RED_PINE_NUTS.get(), null, 2));
    public static final RegistryObject<Item> SPICE_GLACE_GOJI_BERRIES  = ITEMS.register("spice_glace_goji_berries", () -> new SpiceBlockItem(BlockRegistry.SPICE_GLACE_GOJI_BERRIES.get(), null, 1));
    public static final RegistryObject<Item> SPICE_FROZEN_PERSIMMON  = ITEMS.register("spice_frozen_persimmon", () -> new SpiceBlockItem(BlockRegistry.SPICE_FROZEN_PERSIMMON.get(), null, 1));
    public static final RegistryObject<Item> SPICE_ROASTED_PECANS  = ITEMS.register("spice_roasted_pecans", () -> new SpiceBlockItem(BlockRegistry.SPICE_ROASTED_PECANS.get(), null, 2));
    public static final RegistryObject<Item> SPICE_SILVER_NEEDLE_WHITE_TEA  = ITEMS.register("spice_silver_needle_white_tea", () -> new SpiceBlockItem(BlockRegistry.SPICE_SILVER_NEEDLE_WHITE_TEA.get(), null, 2));
    public static final RegistryObject<Item> SPICE_GOLDEN_CINNAMON_POWDER  = ITEMS.register("spice_golden_cinnamon_powder", () -> new SpiceBlockItem(BlockRegistry.SPICE_GOLDEN_CINNAMON_POWDER.get(), null, 2));
    public static final RegistryObject<Item> SPICE_DRIED_SELAGINELLA   = ITEMS.register("spice_dried_selaginella", () -> new SpiceBlockItem(BlockRegistry.SPICE_DRIED_SELAGINELLA.get(), null, 2));
}
