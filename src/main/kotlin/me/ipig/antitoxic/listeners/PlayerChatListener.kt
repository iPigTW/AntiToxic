package me.ipig.antitoxic.listeners

import org.bukkit.configuration.file.FileConfiguration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class PlayerChatListener(private val config: FileConfiguration):Listener {
    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {
        val keywords = config.getList("keywords")
        for (keyword in keywords) {
            if (event.message.contains(keyword as String)) {
                event.player.sendMessage(config.getString("response"))
                event.isCancelled = true
                break

            }
        }
    }
}