package lekavar.lma.drinkbeer.recipes;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import java.util.List;

public interface IBrewingInventory extends Container {
    /**
     * Must return copy of itemstack in Ingredient Slots
     */
    @Nonnull
    List<ItemStack> getIngredients();

    /**
     * Must return copy of itemstack in Cup Slots
     */
    @Nonnull
    ItemStack getCup();
    
    /*
     * Return the FluidIngredient for our recipe
     */
    @Nonnull
    FluidStack getFluidIngredient();

    FluidStack assemble();
    
}
