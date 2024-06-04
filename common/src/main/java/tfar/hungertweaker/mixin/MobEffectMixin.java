package tfar.hungertweaker.mixin;

import net.minecraft.world.effect.MobEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import tfar.hungertweaker.HungerTweaker;

@Mixin(MobEffect.class)
public class MobEffectMixin {

    @ModifyArg(method = "applyEffectTick",at = @At(value = "INVOKE", target = HungerTweaker.EXHAUST))
    private float modifyHunger(float value) {
        return (float) (HungerTweaker.getConfig().hunger() * value);
    }

}
