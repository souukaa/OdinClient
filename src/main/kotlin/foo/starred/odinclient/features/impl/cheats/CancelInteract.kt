package foo.starred.odinclient.features.impl.cheats

import com.odtheking.odin.events.core.onSend
import com.odtheking.odin.features.Module
import net.minecraft.network.protocol.game.ServerboundUseItemOnPacket
import net.minecraft.world.item.Items
import foo.starred.odinclient.utils.Skit

object CancelInteract : Module(
    name = "Cancel Interact",
    description = "Cancels your interaction with blocks if you are holding an ender pearl.",
    category = Skit.CHEATS
) {
    init {
        onSend<ServerboundUseItemOnPacket> {
            if (mc.player?.getItemInHand(hand)?.item != Items.ENDER_PEARL) return@onSend
            it.cancel()
        }
    }
}