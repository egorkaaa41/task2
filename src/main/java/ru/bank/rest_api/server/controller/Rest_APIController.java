package ru.bank.rest_api.server.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.bank.rest_api.server.dao.CodesDao;
import ru.bank.rest_api.server.dao.TransactionsDao;
import ru.bank.rest_api.server.model.Transactions;
import java.io.IOException;

@Controller
@RequestMapping("service")
public class Rest_APIController {


    @Autowired
    private TransactionsDao transDao;
    private CodesDao codesDao;

    /**
     * curl -X POST -i localhost:8080/chat/login -d "name=I_AM_STUPID"
     */
    @RequestMapping(
            path = "transaction",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> transaction(@RequestParam("name")  String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Transactions trans = mapper.readValue(json, Transactions.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return ResponseEntity.ok().build();
    }

/**
 * с возможность вывести все статусы по определенному коду *
 **/
    @GetMapping("/{code}")
    @ResponseBody
    public String email(@PathVariable String code) {


        return null;
    }
}
