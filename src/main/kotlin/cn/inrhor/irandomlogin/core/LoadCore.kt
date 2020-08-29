package cn.inrhor.irandomlogin.core

import cn.inrhor.irandomlogin.IRandomLogin
import io.izzel.taboolib.module.config.TConfig
import org.bukkit.Location
import org.bukkit.configuration.file.YamlConfiguration
import org.bukkit.entity.Player

object LoadCore {
    var centerLoc : Location? = null
    var addR : Int? = null

    fun set(player: Player, addR : Int) {
        centerLoc = player.location
        this.addR = addR
        save()
    }

    fun save() {
        val config : YamlConfiguration = IRandomLogin.config
        config.set("login.center", centerLoc)
        config.set("login.addR", addR)
        IRandomLogin.config.saveToFile()
    }

    fun load() {
        val config : YamlConfiguration = IRandomLogin.config
        centerLoc = config.getLocation("login.center")
        addR = config.getInt("login.addR")
    }

    fun random(player: Player) {
        val randomX = (-addR!!..addR!!).random().toDouble()
        val randomZ = (-addR!!..addR!!).random().toDouble()
        centerLoc?.add(randomX, 0.0, randomZ)?.let { player.teleport(it) }
    }
}