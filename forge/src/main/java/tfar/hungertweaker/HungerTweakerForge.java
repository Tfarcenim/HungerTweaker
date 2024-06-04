package tfar.hungertweaker;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;
import tfar.hungertweaker.platform.TomlConfig;

@Mod(HungerTweaker.MOD_ID)
public class HungerTweakerForge {
    
    public HungerTweakerForge() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_SPEC);
        HungerTweaker.init();
    }


    public static final TomlConfig.Server SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<TomlConfig.Server, ForgeConfigSpec> specPair2 = new ForgeConfigSpec.Builder().configure(TomlConfig.Server::new);
        SERVER_SPEC = specPair2.getRight();
        SERVER = specPair2.getLeft();
    }
}