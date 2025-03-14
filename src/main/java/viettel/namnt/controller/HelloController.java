package viettel.namnt.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Tag(name = "Hello Controller", description = "Hello Controller of Nam")
public class HelloController {

    @Operation(summary = "Test API", description = "Mo ta chi tiet")
    @GetMapping("/hello")
    public String getting(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
