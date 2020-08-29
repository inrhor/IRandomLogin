package cn.inrhor.irandomlogin

import io.izzel.taboolib.loader.Plugin
import io.izzel.taboolib.loader.PluginRedefine
import io.izzel.taboolib.module.config.TConfig
import io.izzel.taboolib.module.inject.TInject

@Plugin.Version(5.34)
object IRandomLogin : PluginRedefine() {
    @TInject
    lateinit var config : TConfig

    @TInject(state = TInject.State.STARTING, init = "init")
    lateinit var loader : PluginLoader

}