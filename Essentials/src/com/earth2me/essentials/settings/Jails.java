package com.earth2me.essentials.settings;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Location;
import com.earth2me.essentials.storage.MapValueType;
import com.earth2me.essentials.storage.StorageObject;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = false)
public class Jails implements StorageObject
{
	@MapValueType(Location.class)
	private Map<String, Location> jails = new HashMap<String, Location>();
}
