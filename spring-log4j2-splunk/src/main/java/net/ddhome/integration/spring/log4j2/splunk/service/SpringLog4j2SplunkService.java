package net.ddhome.integration.spring.log4j2.splunk.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author gourab majumder
 */
@Service
public class SpringLog4j2SplunkService implements CommandLineRunner {
    private Logger log = LogManager.getLogger(SpringLog4j2SplunkService.class);

    public void run(String[] args) {
        log.info("Running Test Event for Splunk Logging Demo..." + new Date());

        log.error("This is a test error in splunk from log4j2 " + new Date());
    }
}