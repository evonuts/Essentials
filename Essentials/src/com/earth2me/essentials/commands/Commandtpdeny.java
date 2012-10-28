package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import org.bukkit.Server;
import com.earth2me.essentials.User;


public class Commandtpdeny extends EssentialsCommand
{
	public Commandtpdeny()
	{
		super("tpdeny");
	}

	@Override
	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		final User player = user.getTeleportRequest();
		if (player == null)
		{
			throw new Exception(_("noPendingRequest"));
		}

		user.sendMessage(_("requestDenied"));
		player.sendMessage(_("requestDeniedFrom", user.getDisplayName()));
		user.requestTeleport(null, false);
	}
}
