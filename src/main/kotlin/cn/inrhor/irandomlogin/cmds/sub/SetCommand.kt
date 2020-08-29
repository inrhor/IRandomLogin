package cn.inrhor.irandomlogin.cmds.sub


import cn.inrhor.irandomlogin.IRandomLogin
import cn.inrhor.irandomlogin.core.LoadCore
import cn.inrhor.irandomlogin.utils.Check
import cn.inrhor.irandomlogin.utils.MsgUtil
import io.izzel.taboolib.module.command.base.BaseSubCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SetCommand : BaseSubCommand() {
    override fun onCommand(sender: CommandSender, command: Command, label : String, args: Array<out String>) {
        if (sender !is Player) {
            MsgUtil.send("&c禁止后台使用此命令")
            return
        }

        if (args.size != 1) {
            MsgUtil.send(sender, "&c格式错误： &f/ial set 半径大小")
            return
        }

        if (!Check.isNumber(args[0])) {
            MsgUtil.send(sender, "&c请输入正确正整数")
            return
        }

        val addR = args[0].toInt()

        val player : Player = sender

        LoadCore.set(player, addR)
        MsgUtil.send(sender, "&a已在你的中心位置设置随机 $addR 半径的登陆点")
    }
}