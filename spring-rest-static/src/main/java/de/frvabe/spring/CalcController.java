package de.frvabe.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {

    @GetMapping("/addition/{a}/{b}")
    public int addition(@PathVariable final int a, @PathVariable final int b) {
        return a + b;
    }

    @GetMapping("/subtraction/{a}/{b}")
    public int subtraction(@PathVariable final int a, @PathVariable final int b) {
        return a - b;
    }

    @GetMapping("/division/{a}/{b}")
    public int division(@PathVariable final int a, @PathVariable final int b) {
        return a / b;
    }

    @GetMapping("/multiplication/{a}/{b}")
    public int multiplication(@PathVariable final int a, @PathVariable final int b) {
        return a * b;
    }

}
