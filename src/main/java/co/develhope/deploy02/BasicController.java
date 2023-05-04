package co.develhope.deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {
    @GetMapping
    public int getSum(){
        return 2*2;
    }
}
