package gg.ninjagaming.disableleavesandsapplings.eventlisteners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockFormEvent

object BlockFormEventListener: Listener {
    @EventHandler
    fun onBlockFormEvent(event: BlockFormEvent) {
        event.isCancelled = true
    }
}