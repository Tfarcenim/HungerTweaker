package tfar.hungertweaker.mixin;

import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import tfar.hungertweaker.HungerTweaker;

@Mixin(Player.class)
public class PlayerMixin {

    @ModifyArg(method = HungerTweaker.CHECK,at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 0))
    private float modifySwimming(float value) {
        return (float) (HungerTweaker.getConfig().swimming() * value);
    }

    @ModifyArg(method = HungerTweaker.CHECK,at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 1))
    private float modifyWalkingUnderwater(float value) {
        return (float) (HungerTweaker.getConfig().walkUnderWater() * value);
    }

    @ModifyArg(method = HungerTweaker.CHECK,at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 2))
    private float modifyWalkingOnWater(float value) {
        return (float) (HungerTweaker.getConfig().walkOnWater() * value);
    }

    @ModifyArg(method = HungerTweaker.CHECK,at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 3))
    private float modifySprinting(float value) {
        return (float) (HungerTweaker.getConfig().sprinting() * value);
    }

    @ModifyArg(method = "attack",at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST))
    private float modifyAttack(float value) {
        return (float) (HungerTweaker.getConfig().attack() * value);
    }

    @ModifyArg(method = "jumpFromGround",at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 0))
    private float modifySprintJump(float value) {
        return (float) (HungerTweaker.getConfig().sprintJumping() * value);
    }

    @ModifyArg(method = "jumpFromGround",at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST,ordinal = 1))
    private float modifyJump(float value) {
        return (float) (HungerTweaker.getConfig().jumping() * value);
    }


}
