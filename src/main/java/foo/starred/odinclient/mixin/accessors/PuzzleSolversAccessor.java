package foo.starred.odinclient.mixin.accessors;

import com.odtheking.odin.features.impl.dungeon.puzzlesolvers.PuzzleSolvers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value = PuzzleSolvers.class, remap = false)
public interface PuzzleSolversAccessor {
    @Invoker(value = "getDraftPrompt")
    boolean invokeDraft();
}