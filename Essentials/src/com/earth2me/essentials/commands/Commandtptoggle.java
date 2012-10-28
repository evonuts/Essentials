package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import org.bukkit.Server;
import com.earth2me.essentials.User;


public class Commandtptoggle extends EssentialsCommand
{
	public Commandtptoggle()
	{
		super("tptoggle");
	}

	@Override
	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		user.sendMessage(
				user.toggleTeleportEnabled() ? _("teleportationEnabled") : _("teleportationDisabled"));
	}
}
