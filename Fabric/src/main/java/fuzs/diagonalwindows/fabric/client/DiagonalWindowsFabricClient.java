package fuzs.diagonalwindows.fabric.client;

import fuzs.diagonalwindows.common.DiagonalWindows;
import fuzs.diagonalwindows.common.client.DiagonalWindowsClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class DiagonalWindowsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindowsClient::new);
    }
}
