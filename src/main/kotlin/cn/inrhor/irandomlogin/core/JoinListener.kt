package cn.inrhor.irandomlogin.core

import fr.xephi.authme.events.LoginEvent
import io.izzel.taboolib.module.inject.TListener
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

@TListener
class JoinListener : Listener {

    @EventHandler
    fun onJoin(ev : PlayerJoinEvent) {
        val player = ev.player
        LoadCore.random(player)
        player.isGlowing = true
        player.addPotionEffect(
            PotionEffect(
                PotionEffectType.INVISIBILITY,
                Int.MAX_VALUE,
                3,
                false,
                false
            )
        )
    }

    @EventHandler
    fun onLogin(ev : LoginEvent) {
        val player = ev.player
        player.isGlowing = false
        player.removePotionEffect(PotionEffectType.INVISIBILITY)
    }
}