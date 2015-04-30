package jgamerthepally.timelystonesmod.init;

import jgamerthepally.timelystonesmod.item.ItemTestItem;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by jgamer2 on 4/30/2015.
 */
public class ModItems {

    public static ItemTestItem testitem;

    public static void init(){
        testitem = new ItemTestItem();
        GameRegistry.registerItem(testitem, "testitem");
    }
}
