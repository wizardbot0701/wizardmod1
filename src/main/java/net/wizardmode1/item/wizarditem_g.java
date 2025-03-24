package net.wizardmode1.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wizardmode1.Wizardmod;

public class wizarditem_g {
    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Wizardmod.MOD_ID, "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(wizarditem_1item.SUSPICIOUS_SUBSTANCE))
            .displayName(Text.translatable("itemGroup.wizardmod1"))
            .build();

    public static void initialize() {
            Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);  // 수정된 부분

            // 아이템 그룹에 아이템 추가
            ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
                itemGroup.add(wizarditem_1item.SUSPICIOUS_SUBSTANCE);
                // 다른 아이템도 추가 가능
            });
    }
}
