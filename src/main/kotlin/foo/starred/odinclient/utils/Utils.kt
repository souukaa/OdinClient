package foo.starred.odinclient.utils

import com.odtheking.odin.OdinMod.mc
import com.odtheking.odin.utils.customData
import com.odtheking.odin.utils.handlers.schedule
import com.odtheking.odin.utils.modMessage
import net.minecraft.network.chat.Component
import net.minecraft.world.item.ItemStack
import foo.starred.odinclient.OdinClient.joinListeners
import kotlin.jvm.optionals.getOrNull

fun Component.notify() {
    if (mc.level != null) modMessage(this)
    else joinListeners.add { schedule(20) { modMessage(this) } }
}

inline val ItemStack.nullableID: String?
    get() = customData.getString("id").getOrNull()

inline val ItemStack.nullableUUID: String?
    get() = customData.getString("uuid").getOrNull()