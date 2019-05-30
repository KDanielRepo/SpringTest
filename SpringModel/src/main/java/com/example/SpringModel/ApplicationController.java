package com.example.SpringModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;


@RestController
public class ApplicationController {

    @Autowired
    EntityRepo entityRepo;

    @GetMapping(path="tabela")
    public @ResponseBody Iterable<EntityRepoImpl> getUsers(){
        return entityRepo.findAll();
    }

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Klasa metoda(InnaKlasa costam)throws Exception{
        return new Klasa("Witaj ponownie, "+ HtmlUtils.htmlEscape(costam.getterKlasy));
    }

}
