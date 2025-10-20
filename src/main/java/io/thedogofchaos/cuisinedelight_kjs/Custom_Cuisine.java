package io.thedogofchaos.cuisinedelight_kjs;

import com.mojang.logging.LogUtils;
import io.thedogofchaos.cuisinedelight_kjs.common.CommonProxy;
import io.thedogofchaos.cuisinedelight_kjs.client.ClientProxy;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

@Mod(Custom_Cuisine.MOD_ID)
public class Custom_Cuisine {
    /** Your mods' id. MUST ALWAYS BE THE SAME AS THE mod_id FIELD IN gradle.properties */
    public static final String MOD_ID = "custom_cuisine";
    /** The human-readable version of your mod's id. Works best if this is the same as the mod_name field in gradle.properties. */
    public static final String MOD_NAME = "Custom Cuisine";

    /** Initialises a SLF4J logging instance, for outputting information to the console (and by extension, the logfiles) on-demand. */
    public static final Logger LOGGER = LogUtils.getLogger();

    public Custom_Cuisine() {
        Custom_Cuisine.init();

        // DistExecutor allows you to make sure that the correct code is being loaded for the current side that the mod is running on (either a dedicated client, or a dedicated server).
        // Dedicated servers WILL CRASH if they encounter ANY method calls or classes that would be client-only, like rendering calls. Use this to be sure.
        CommonProxy proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> CommonProxy::new);
        proxy.init(proxy.modEventBus);
    }

    /** Do anything that needs to be executed statically here. */
    public static void init() {
        LOGGER.info("We're loading {} on the {}", MOD_NAME, FMLEnvironment.dist);
    }
}
