package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.*;
import  java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {

    @GetMapping ("/HelloWorld")
    @ResponseBody

    public String getSaludo(@RequestParam Optional<String> name){
        return "Hola " + name.orElseGet(() -> "Unknown ")+  " ,estàs executant un projecte Maven." ;
    }

    @GetMapping (value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String getSaludo2(@PathVariable(required = false) String name) {
        if (name != null) {
            return "Hola " + name + " , estàs executant un projecte Maven.";
        }
            return "Hola, estàs executant un projecte Maven.";
    }
}

