package fuzs.diagonalwindows.neoforge.client;

import fuzs.diagonalwindows.common.DiagonalWindows;
import fuzs.diagonalwindows.common.client.DiagonalWindowsClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;

@Mod(value = DiagonalWindows.MOD_ID, dist = Dist.CLIENT)
public class DiagonalWindowsNeoForgeClient {

    public DiagonalWindowsNeoForgeClient() {
        ClientModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindowsClient::new);
    }
}
