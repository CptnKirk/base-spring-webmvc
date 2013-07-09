package org.samurai.monitoring;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Developer: Jim Hazen
 * Date: 7/7/13
 * Time: 4:47 PM
 */
@Controller
public class HealthcheckController
{
    private static Map<String, String> GOOD = new HashMap<String, String>(1);

    static
    {
        GOOD.put("response", "good");
    }

    @RequestMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public ResponseEntity<Map> healthcheck()
    {
        return new ResponseEntity<Map>(GOOD, HttpStatus.OK);
    }
}
