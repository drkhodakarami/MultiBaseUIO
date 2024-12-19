package jiraiyah.uio_base;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;

import org.slf4j.LoggerFactory;

public class Main implements ModInitializer
{
	public static final String ModID = "ultraio_base";
	public static final Logger LOGGER = new Logger(ModID);

	@Override
	public void onInitialize()
	{
		LOGGER.logMain();
	}
}