package io.thedogofchaos.becsmodtemplate.client;

import io.thedogofchaos.becsmodtemplate.common.CommonProxy;
import net.minecraftforge.eventbus.api.IEventBus;

import static io.thedogofchaos.becsmodtemplate.Becs_Mod_Template.LOGGER;

/**
 * The ClientProxy class handles all client-specific operations for your mod.
 *
 * <p>
 * It extends CommonProxy, so it already has all the common functionality shared by both client and server.
 * Use this class for any tasks that should only happen on the client side, like rendering, input handling,
 * and sound management.
 * </p>
 *
 * <p>
 * Since this class is only loaded on the client, it's safe to use client-only code here. The constructor logs
 * a message when the client proxy is loaded, and the init method calls the common initialization logic.
 * </p>
 */
public class ClientProxy extends CommonProxy {
    public ClientProxy(){
        super();
        LOGGER.info("ClientProxy loading!");
    }

    @Override
    public void init(IEventBus modEventBus) {
        super.init(modEventBus);
    }
}
