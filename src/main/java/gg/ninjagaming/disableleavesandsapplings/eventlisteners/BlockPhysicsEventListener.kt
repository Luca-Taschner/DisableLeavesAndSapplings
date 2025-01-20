package gg.ninjagaming.disableleavesandsapplings.eventlisteners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPhysicsEvent

object BlockPhysicsEventListener: Listener {
    @EventHandler
    fun onBlockPhysicsEvent(event: BlockPhysicsEvent) {
        event.isCancelled = true
    }
}