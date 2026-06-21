package foo.starred.odinclient.utils

import com.mojang.blaze3d.platform.InputConstants
import com.odtheking.odin.OdinMod.mc
import net.minecraft.client.KeyMapping
import net.minecraft.world.inventory.ContainerInput
import foo.starred.odinclient.mixin.accessors.KeyMappingAccessor

private fun KeyMapping.boundKey(): InputConstants.Key? =
    (this as? KeyMappingAccessor)?.boundKey

fun rightClick() {
    val key = mc.options?.keyUse?.boundKey() ?: return
    KeyMapping.set(key, true)
    KeyMapping.click(key)
    KeyMapping.set(key, false)
}

fun leftClick() {
    val key = mc.options?.keyAttack?.boundKey() ?: return
    KeyMapping.set(key, true)
    KeyMapping.click(key)
    KeyMapping.set(key, false)
}

fun guiClick(id: Int, index: Int, button: Int = 0, clickType: ContainerInput = ContainerInput.PICKUP) {
    val player = mc.player ?: return
    //~ if >= 26.1 'handleInventoryMouseClick' -> 'handleContainerInput'
    mc.gameMode?.handleContainerInput(id, index, button, clickType, player)
}
