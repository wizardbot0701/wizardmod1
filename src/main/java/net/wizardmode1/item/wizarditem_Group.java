//package net.wizardmode1.item;
//
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.MinecartItem;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.RegistryKey;
//import net.minecraft.text.Text;
//import net.minecraft.util.Identifier;
//import net.wizardmode1.Wizardmod;
//import net.minecraft.item.Item;
//
//public class wizarditem_Group {
//    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Wizardmod.MOD_ID, "item_group"));
//    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
//            .icon(() -> new ItemStack())
//            .displayName(Text.translatable("itemGroup.fabric_docs_reference"))
//            .build();
//}
