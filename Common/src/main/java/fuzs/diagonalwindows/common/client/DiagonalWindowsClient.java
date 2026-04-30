package fuzs.diagonalwindows.common.client;

import fuzs.diagonalwindows.common.DiagonalWindows;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.common.api.config.v3.ConfigHolder;

public class DiagonalWindowsClient implements ClientModConstructor {
    @Override
    public void onConstructMod() {
        ConfigHolder.registerConfigurationScreen(DiagonalWindows.MOD_ID, "diagonalblocks");
    }
}
