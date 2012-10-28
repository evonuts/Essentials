package com.earth2me.essentials.commands;

import static com.earth2me.essentials.I18n._;
import org.bukkit.Server;
import org.bukkit.event.entity.EntityDamageEvent;
import com.earth2me.essentials.User;


public class Commandsuicide extends EssentialsCommand
{
	public Commandsuicide()
	{
		super("suicide");
	}

	@Override
	public void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		EntityDamageEvent ede = new EntityDamageEvent(user.getBase(), EntityDamageEvent.DamageCause.SUICIDE, Short.MAX_VALUE);
		server.getPluginManager().callEvent(ede);
		user.damage(Short.MAX_VALUE);
		user.sendMessage(_("suicideMessage"));
		user.setDisplayNick();
		ess.broadcastMessage(user,_("suicideSuccess", user.getDisplayName()));		
	}
}
