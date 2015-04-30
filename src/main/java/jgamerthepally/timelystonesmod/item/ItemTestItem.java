package jgamerthepally.timelystonesmod.item;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by jgamer2 on 4/21/2015.
 */
public class ItemTestItem extends ItemTSM {
    public final String name = "testitem";
    public ItemTestItem() {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabAllSearch);
        this.setNoRepair();
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){

        if (!world.isRemote) {
            if (world.getWorldTime() > 6000){
                world.setWorldTime(6000);
                itemStack.damageItem(0, player);
            }else if(world.getWorldTime() > 6000){
                world.setWorldTime(18000);
                itemStack.damageItem(0,player);
            }
        }
        if(world.isRemote) {
            if (world.getWorldTime() > 6000){
                world.setWorldTime(6000);
                itemStack.damageItem(0, player);
            }else if(world.getWorldTime() > 0){
                world.setWorldTime(18000);
                itemStack.damageItem(0,player);
            }
        }

        return itemStack;
    }

}
