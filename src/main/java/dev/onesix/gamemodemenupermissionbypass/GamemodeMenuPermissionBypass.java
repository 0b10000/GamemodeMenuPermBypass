package dev.onesix.gamemodemenupermissionbypass;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GamemodeMenuPermissionBypass implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("GamemodeMenuPermissionBypass");

    @Override
    public void onInitialize() {
        LOGGER.info("Gamemode Menu Permission Bypass has been initialized!");
    }
}
