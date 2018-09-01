package fnitters.doublexp
import org.bukkit.plugin.java.JavaPlugin

class DoubleXP : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(XpListener(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
