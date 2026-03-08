package net.knownsh.figurasvc.fabric;

import net.fabricmc.api.ModInitializer;
import net.knownsh.figurasvc.FiguraSVC;
import de.maxhenkel.voicechat.api.VoicechatApi;
import de.maxhenkel.voicechat.api.events.ClientReceiveSoundEvent;
/**
 * A mod class is not technically needed for Fabric to load the Plugin, but it's still nice to have.
 */
public class FiguraSVCFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FiguraSVC.init();
    }
}
