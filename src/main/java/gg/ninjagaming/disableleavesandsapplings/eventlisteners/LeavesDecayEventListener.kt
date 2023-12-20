package gg.ninjagaming.disableleavesandsapplings.eventlisteners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.LeavesDecayEvent

class LeavesDecayEventListener: Listener {
    @EventHandler
    fun onLeavesDecay(event: LeavesDecayEvent){
        event.isCancelled = true
    }
}