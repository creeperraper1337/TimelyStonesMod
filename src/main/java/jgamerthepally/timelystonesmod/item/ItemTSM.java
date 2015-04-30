package jgamerthepally.timelystonesmod.item;

import jgamerthepally.timelystonesmod.ref.Reference;
import jgamerthepally.timelystonesmod.util.TSMTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by jgamer2 on 4/30/2015.
 */
public class ItemTSM extends Item {
    public ItemTSM(){
        super();
        this.setCreativeTab(TSMTab.TAB);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {

        return String.format("item.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
