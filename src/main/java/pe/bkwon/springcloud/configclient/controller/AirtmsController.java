package pe.bkwon.springcloud.configclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.bkwon.springcloud.configclient.config.AirtmsConfig;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
//@EnableAutoConfiguration
public class AirtmsController {
    private static Logger log = LoggerFactory.getLogger(AirtmsController.class);
    @Autowired
    private AirtmsConfig config;

    // http://localhost:8080/airtms/config
    @RequestMapping("/airtms/config")
    public ResponseEntity<String> getConfig(HttpServletRequest request) throws IOException {

        log.info("config = " + config);
        return ResponseEntity.ok(config.toString());

    }


}
