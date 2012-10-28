package com.earth2me.essentials.signs;

import static com.earth2me.essentials.I18n._;
import java.util.List;
import com.earth2me.essentials.IEssentials;
import com.earth2me.essentials.User;


public class SignMail extends EssentialsSign
{
	public SignMail()
	{
		super("Mail");
	}

	@Override
	protected boolean onSignInteract(final ISign sign, final User player, final String username, final IEssentials ess) throws SignException
	{
		final List<String> mail = player.getMails();
		if (mail.isEmpty())
		{
			player.sendMessage(_("noNewMail"));
			return false;
		}
		for (String s : mail)
		{
			player.sendMessage(s);
		}
		player.sendMessage(_("markMailAsRead"));
		return true;
	}
}
