package com.example.demo1;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NewRelicLogger {

    private static final Logger logger = LoggerFactory.getLogger(NewRelicLogger.class);

    @Trace(dispatcher = true)
    public void log(String message) {
        NewRelic.addCustomParameter("log_message", message);
        logger.info(message);
    }
}
