package cn.inrhor.irandomlogin

import cn.inrhor.irandomlogin.core.LoadCore
import cn.inrhor.irandomlogin.utils.MsgUtil

class PluginLoader {

    fun init() {
        LoadCore.load()
        MsgUtil.send("${MsgUtil.tag} ┍  &a正在加载  &fIRandomLogin  &a插件")
        MsgUtil.send("${MsgUtil.tag} ┝  &3插件当前版本： &f0.0.1")
        MsgUtil.send("${MsgUtil.tag} ┕  &a插件正常运行")
    }

}