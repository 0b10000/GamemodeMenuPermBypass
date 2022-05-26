package io.github.zerob10000.gamemodemenupermissionbypass.mixin;

import net.minecraft.client.gui.screen.GameModeSelectionScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GameModeSelectionScreen.class)
public class GameModeSelectionScreenPermissionBypassMixin {
    @Redirect(method = "apply(Lnet/minecraft/client/MinecraftClient;Ljava/util/Optional;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;hasPermissionLevel(I)Z"))
    private static boolean hasPermissionLevel(ClientPlayerEntity entity, int permissionLevel){
        return true;
    }
}
