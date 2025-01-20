package gg.ninjagaming.disableleavesandsapplings

import gg.ninjagaming.disableleavesandsapplings.eventlisteners.BlockFormEventListener
import gg.ninjagaming.disableleavesandsapplings.eventlisteners.BlockGrowEventListener
import gg.ninjagaming.disableleavesandsapplings.eventlisteners.BlockPhysicsEventListener
import gg.ninjagaming.disableleavesandsapplings.eventlisteners.LeavesDecayEventListener
import org.bukkit.plugin.java.JavaPlugin

class DisableLeavesAndSapplings : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        registerEvents()

    }

    private fun registerEvents() {
        server.pluginManager.registerEvents(LeavesDecayEventListener(), this)
        server.pluginManager.registerEvents(BlockGrowEventListener(), this)
        server.pluginManager.registerEvents(BlockPhysicsEventListener, this)
        server.pluginManager.registerEvents(BlockFormEventListener, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
