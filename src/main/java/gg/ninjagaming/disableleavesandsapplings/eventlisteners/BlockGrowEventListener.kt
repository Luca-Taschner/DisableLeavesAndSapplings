package gg.ninjagaming.disableleavesandsapplings.eventlisteners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockGrowEvent

class BlockGrowEventListener : Listener{
    @EventHandler
    fun onBlockGrowEvent(event: BlockGrowEvent) {
        event.isCancelled = true
    }
}