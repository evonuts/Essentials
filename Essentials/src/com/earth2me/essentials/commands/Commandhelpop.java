package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import java.util.logging.Level;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import com.earth2me.essentials.User;
import com.earth2me.essentials.Util;


public class Commandhelpop extends EssentialsCommand
{
	public Commandhelpop()
	{
		super("helpop");
	}

	@Override
	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		if (args.length < 1)
		{
			throw new NotEnoughArgumentsException();
		}
		user.setDisplayNick();
		final String message = _("helpOp", user.getDisplayName(), Util.stripFormat(getFinalArg(args, 0)));
		logger.log(Level.INFO, message);
		for (Player onlinePlayer : server.getOnlinePlayers())
		{
			final User player = ess.getUser(onlinePlayer);
			if (!player.isAuthorized("essentials.helpop.receive"))
			{
				continue;
			}
			player.sendMessage(message);
		}
	}
}
