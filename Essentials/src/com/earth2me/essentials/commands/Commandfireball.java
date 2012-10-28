package com.earth2me.essentials.commands;

import org.bukkit.Server;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.SmallFireball;
import org.bukkit.util.Vector;
import com.earth2me.essentials.User;


public class Commandfireball extends EssentialsCommand
{
	public Commandfireball()
	{
		super("fireball");
	}

	@Override
	protected void run(final Server server, final User user, final String commandLabel, final String[] args) throws Exception
	{
		boolean small = false;
		if (args.length > 0 && args[0].equalsIgnoreCase("small"))
		{
			small = true;
		}
		final Vector direction = user.getEyeLocation().getDirection().multiply(2);
		Fireball fireball = user.getWorld().spawn(user.getEyeLocation().add(direction.getX(), direction.getY(), direction.getZ()), small ? SmallFireball.class : Fireball.class);
		fireball.setShooter(user.getBase());
	}
}
