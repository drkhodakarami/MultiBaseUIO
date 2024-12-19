package jiraiyah.uio_battle;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;

import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ModID = "ultraio_battle";
	public static final jiraiyah.logger.Logger LOGGER = new Logger(ModID);

	@Override
	public void onInitialize()
	{
		LOGGER.logMain();
	}
}