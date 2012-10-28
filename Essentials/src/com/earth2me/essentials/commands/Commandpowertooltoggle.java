package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import org.bukkit.Server;
import com.earth2me.essentials.User;


public class Commandpowertooltoggle extends EssentialsCommand
{
	public Commandpowertooltoggle()
	{
		super("powertooltoggle");
	}

	@Override
	protected void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		if (!user.hasPowerTools())
		{
			user.sendMessage(_("noPowerTools"));
			return;
		}
		user.sendMessage(
				user.togglePowerToolsEnabled() ? _("powerToolsEnabled") : _("powerToolsDisabled"));
	}
}
