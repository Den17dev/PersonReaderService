package com.person.personreaderservice.controller;

import com.person.personreaderservice.entity.Persons;
import com.person.personreaderservice.service.PersonReaderService;
import com.person.personreaderservice.service.PersonReaderServiceAsync;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class PersonReaderController {

  private final PersonReaderService personReaderService;

  @GetMapping("/persons")
  public List<Persons> getAllPersonsByPage(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "100") int limit) throws ExecutionException, InterruptedException {
    return personReaderService.getAllPersonsByPage(pageNum, limit);
  }

  @GetMapping("/persons/{id}")
  public Persons getPersonById(@PathVariable(value = "id") Long id) throws ExecutionException, InterruptedException {
    return personReaderService.getPersonById(id);
  }

}
