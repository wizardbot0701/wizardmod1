package net.wizardmode1;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.wizardmode1.Screen.wizardscreen_1;
import org.lwjgl.glfw.GLFW;

public class WizardmodClient implements ClientModInitializer {
    private static KeyBinding openScreenKey;

    @Override
    public void onInitializeClient() {
        openScreenKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.wizardmod.openscreen",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                "category.wizardmod"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openScreenKey.wasPressed()) {
                client.setScreen(new wizardscreen_1(net.minecraft.text.Text.of("Wizard Screen")));
            }
        });
    }
}
