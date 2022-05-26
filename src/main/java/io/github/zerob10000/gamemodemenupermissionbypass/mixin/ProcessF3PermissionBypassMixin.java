package io.github.zerob10000.gamemodemenupermissionbypass.mixin;

import net.minecraft.client.Keyboard;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Keyboard.class)
public class ProcessF3PermissionBypassMixin {
    @Redirect(method = "processF3", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;hasPermissionLevel(I)Z"))
    private boolean hasPermissionLevel(ClientPlayerEntity entity, int permissionLevel){
        return true;
    }
}
