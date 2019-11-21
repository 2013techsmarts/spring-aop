package org.smarttechie;

import org.smarttechie.service.LegacyApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
	@Autowired
	private  LegacyApplicationService legacyApplicationService;

    @Override
    public void run(String...args) throws Exception {
    	legacyApplicationService.pushNotification();

    }
}
