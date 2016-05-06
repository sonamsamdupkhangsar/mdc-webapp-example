package org.sonamexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
    @RequestMapping("/")
    public String index() {
    	MDC.put("clientName", "Sonam");
    	logger.info("hello MDC");
        return "Greetings from Spring Boot!";
    }

}