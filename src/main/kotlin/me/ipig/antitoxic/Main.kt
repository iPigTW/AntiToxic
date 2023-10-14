package me.ipig.antitoxic


import me.ipig.antitoxic.listeners.PlayerChatListener
import org.bukkit.plugin.java.JavaPlugin
import java.io.File


class AntiToxic : JavaPlugin() {

    override fun onEnable() {
        val list = arrayListOf("ez")
        val config = getConfig()
        config.addDefault("keywords", list)
        config.addDefault("response", "No toxic!")
        config.options().copyDefaults(true)
        saveConfig()
        server.pluginManager.registerEvents(PlayerChatListener(config), this)

    }

}
