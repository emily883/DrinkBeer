package lekavar.lma.drinkbeer.registries;

import lekavar.lma.drinkbeer.DrinkBeer;
import lekavar.lma.drinkbeer.gui.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType ;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;
import slimeknights.mantle.registration.deferred.MenuTypeDeferredRegister;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Register Container & ContainerScreen in one class.
// Automatically Registering Static Event Handlers, see https://mcforge.readthedocs.io/en/1.16.x/events/intro/#automatically-registering-static-event-handlers
@Mod.EventBusSubscriber(modid = DrinkBeer.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ContainerTypeRegistry {
    public static final MenuTypeDeferredRegister CONTAINERS = new MenuTypeDeferredRegister(DrinkBeer.MOD_ID);
    public static final RegistryObject<MenuType<BeerBarrelContainer>> BEER_BARREL_CONTAINER = CONTAINERS.register("beer_barrel_container", (windowId, inv, data) -> new BeerBarrelContainer(windowId, inv, data, inv.player));
    public static final RegistryObject<MenuType<BartendingTableContainer>> bartendingTableContainer = CONTAINERS.register("bartending_table_normal_container", BartendingTableContainer::new);
    public static final RegistryObject<MenuType<TradeBoxContainer>> tradeBoxContainer = CONTAINERS.register("trade_box_normal_container", TradeBoxContainer::new);
    
    @SubscribeEvent
    public static void registerContainerScreen(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ContainerTypeRegistry.BEER_BARREL_CONTAINER.get(), BeerBarrelContainerScreen::new);
            MenuScreens.register(ContainerTypeRegistry.bartendingTableContainer.get(), BartendingTableContainerScreen::new);
            MenuScreens.register(ContainerTypeRegistry.tradeBoxContainer.get(), TradeBoxContainerScreen::new);
        });
    }
}