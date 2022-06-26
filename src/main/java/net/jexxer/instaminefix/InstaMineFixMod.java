package net.jexxer.instaminefix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstaMineFixMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("instaminefix");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
