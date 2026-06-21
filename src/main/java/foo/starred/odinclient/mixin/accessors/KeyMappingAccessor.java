package foo.starred.odinclient.mixin.accessors;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.ToggleKeyMapping;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({ KeyMapping.class, ToggleKeyMapping.class })
public interface KeyMappingAccessor {
    @Accessor("clickCount")
    int getClickCount();

    @Accessor("clickCount")
    void setClickCount(int count);

    @Accessor("key")
    InputConstants.Key getBoundKey();
}
