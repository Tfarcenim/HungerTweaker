package tfar.hungertweaker.platform;

import net.minecraftforge.common.ForgeConfigSpec;

public class TomlConfig implements MLConfig {
    @Override
    public double naturalRegen() {
        return Server.NATURAL_REGEN.get();
    }

    @Override
    public double fastNaturalRegen() {
        return Server.FAST_NATURAL_REGEN.get();
    }

    @Override
    public double sprinting() {
        return Server.SPRINTING.get();
    }

    @Override
    public double swimming() {
        return Server.SWIMMING.get();
    }

    @Override
    public double walkUnderWater() {
        return Server.WALK_UNDER_WATER.get();
    }

    @Override
    public double walkOnWater() {
        return Server.WALK_ON_WATER.get();
    }

    @Override
    public double attack() {
        return Server.ATTACK.get();
    }

    @Override
    public double hunger() {
        return Server.HUNGER.get();
    }

    @Override
    public double jumping() {
        return Server.JUMPING.get();
    }

    @Override
    public double blockBreak() {
        return Server.BLOCK_BREAK.get();
    }

    @Override
    public double sprintJumping() {
        return Server.SPRINT_JUMPING.get();
    }

    static final String M = "multiplicative";

    public static class Server {

        public static ForgeConfigSpec.DoubleValue NATURAL_REGEN;
        public static ForgeConfigSpec.DoubleValue FAST_NATURAL_REGEN;
        public static ForgeConfigSpec.DoubleValue SPRINTING;
        public static ForgeConfigSpec.DoubleValue SWIMMING;
        public static ForgeConfigSpec.DoubleValue WALK_UNDER_WATER;
        public static ForgeConfigSpec.DoubleValue WALK_ON_WATER;
        public static ForgeConfigSpec.DoubleValue ATTACK;
        public static ForgeConfigSpec.DoubleValue HUNGER;
        public static ForgeConfigSpec.DoubleValue JUMPING;
        public static ForgeConfigSpec.DoubleValue SPRINT_JUMPING;
        public static ForgeConfigSpec.DoubleValue BLOCK_BREAK;
        
        static double MAX = 10000;

        public Server(ForgeConfigSpec.Builder builder) {
            builder.push("general");
            NATURAL_REGEN = builder.comment(M).defineInRange("natural_regen", 1, 0, MAX);
            FAST_NATURAL_REGEN = builder.comment(M).defineInRange("fast_natural_regen", 1, 0, MAX);
            SPRINTING = builder.comment(M).defineInRange("sprinting", 1, 0, MAX);
            SWIMMING = builder.comment(M).defineInRange("swimming", 1, 0, MAX);
            WALK_UNDER_WATER = builder.comment(M).defineInRange("walk_under_water", 1, 0, MAX);
            WALK_ON_WATER = builder.comment(M).defineInRange("walk_on_water", 1, 0, MAX);
            ATTACK = builder.comment(M).defineInRange("attack", 1, 0, MAX);
            HUNGER = builder.comment(M).defineInRange("hunger", 1, 0, MAX);
            JUMPING = builder.comment(M).defineInRange("jumping", 1, 0, MAX);
            BLOCK_BREAK = builder.comment(M).defineInRange("block_break", 1, 0, MAX);
            SPRINT_JUMPING = builder.comment(M).defineInRange("sprint_jumping", 1, 0, MAX);
            builder.pop();
        }
    }
}
