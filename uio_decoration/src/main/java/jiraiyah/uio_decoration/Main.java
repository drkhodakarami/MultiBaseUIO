package jiraiyah.uio_decoration;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;

import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ModID = "ultraio_decoration";
	public static final jiraiyah.logger.Logger LOGGER = new Logger(ModID);

	@Override
	public void onInitialize()
	{
		LOGGER.logMain();
	}
}