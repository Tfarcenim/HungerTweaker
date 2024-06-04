package tfar.hungertweaker.mixin;

import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import tfar.hungertweaker.HungerTweaker;

@Mixin(Block.class)
public class BlockMixin {
    @ModifyArg(method = "playerDestroy",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;causeFoodExhaustion(F)V"))
    private float modifyBlockBreak(float value) {
        return (float) (HungerTweaker.getConfig().blockBreak() * value);
    }
}
