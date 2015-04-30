package jgamerthepally.timelystonesmod.util;

import jgamerthepally.timelystonesmod.init.ModBlocks;
import jgamerthepally.timelystonesmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by jgamer2 on 4/30/2015.
 */
public class TSMTab {
    public static final CreativeTabs TAB = new CreativeTabs("TimelyStonesMod".toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.testitem;
        }
    };
}
