package jgamerthepally.timelystonesmod;


import jgamerthepally.timelystonesmod.init.InventoryRender;
import jgamerthepally.timelystonesmod.init.ModBlocks;
import jgamerthepally.timelystonesmod.init.ModItems;
import jgamerthepally.timelystonesmod.proxy.CommonProxy;
import jgamerthepally.timelystonesmod.ref.Reference;
import jgamerthepally.timelystonesmod.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;




@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class timelystonesmod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event){
        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Init for TimelyStonesMod is over!");
    }

    public void Init(FMLInitializationEvent event){
        InventoryRender.init();
        LogHelper.info("Initialization for TimelyStonesMod is over!");
    }

    public void PostInit(FMLPostInitializationEvent event){
        LogHelper.info("PostInit done!");
    }
}
