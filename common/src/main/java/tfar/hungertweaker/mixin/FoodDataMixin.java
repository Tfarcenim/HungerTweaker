package tfar.hungertweaker.mixin;

import net.minecraft.world.food.FoodData;
import org.spongepowered.asm.mixin.injection.*;
import tfar.hungertweaker.HungerTweaker;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tfar.hungertweaker.platform.Services;

@Mixin(FoodData.class)
public class FoodDataMixin {

    @ModifyVariable(method = "tick",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/food/FoodData;addExhaustion(F)V",ordinal = 0))
    private float modifyFastRegen(float constant) {
        return (float) (constant * HungerTweaker.getConfig().fastNaturalRegen());
    }

    @ModifyConstant(method = "tick",constant = @Constant(floatValue = 6,ordinal = 1))
    private float modifyRegen(float constant) {
        return (float) (constant * HungerTweaker.getConfig().naturalRegen());
    }
}