package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;
import com.earth2me.essentials.Trade;
import com.earth2me.essentials.User;


public class Commandtop extends EssentialsCommand
{
	public Commandtop()
	{
		super("top");
	}

	@Override
	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		final int topX = user.getLocation().getBlockX();
		final int topZ = user.getLocation().getBlockZ();
		final Location location = new Location(user.getWorld(), topX, user.getWorld().getMaxHeight(), topZ);
		user.getTeleport().teleport(location, new Trade(this.getName(), ess), TeleportCause.COMMAND);
		user.sendMessage(_("teleportTop"));
	}
}
