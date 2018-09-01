package fnitters.doublexp
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerExpChangeEvent

class XpListener : Listener {
    @EventHandler
    fun onPlayerExpChange(event: PlayerExpChangeEvent?) {
        event ?: return
        event.amount = event.amount * 2
    }
}