package cn.inrhor.irandomlogin.cmds

import cn.inrhor.irandomlogin.cmds.sub.SetCommand
import io.izzel.taboolib.module.command.base.BaseCommand
import io.izzel.taboolib.module.command.base.BaseMainCommand
import io.izzel.taboolib.module.command.base.BaseSubCommand
import io.izzel.taboolib.module.command.base.SubCommand

@BaseCommand(name = "IRandomLogin", aliases = ["ial", "al"], permission = "ial.set")
class Command : BaseMainCommand() {
    @SubCommand(description = "设置随机登陆的中心点")
    val set : BaseSubCommand = SetCommand()
}