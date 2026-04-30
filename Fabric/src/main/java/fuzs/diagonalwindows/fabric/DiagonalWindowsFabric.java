package fuzs.diagonalwindows.fabric;

import fuzs.diagonalwindows.common.DiagonalWindows;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class DiagonalWindowsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(DiagonalWindows.MOD_ID, DiagonalWindows::new);
    }
}
