package rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * Created by mi3o on 16. 7. 2017.
 */
@Controller
@RequestMapping(value="/rest/1/greeting")
public class GreeterController {


    @RequestMapping(method = RequestMethod.GET, produces = { "application/json" })
    public @ResponseBody
    Greeting greetNoName() {
        return new Greeting("Hello rest");
    }

    public class Greeting {
        private final String content;
        private final LocalDateTime time;

        public Greeting(String content) {
            this.content = content;
            this.time = LocalDateTime.now();
        }

        public String getContent() {
            return this.content;
        }

        public String getTime() {
            return this.time.toString();
        }
    }
}