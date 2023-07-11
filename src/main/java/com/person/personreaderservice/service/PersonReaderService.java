package com.person.personreaderservice.service;

import com.person.personreaderservice.entity.Persons;
import com.person.personreaderservice.util.PersonReaderFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class PersonReaderService {

  private final PersonReaderServiceAsync personReaderServiceAsync;

  public List<Persons> getAllPersonsByPage(Integer page, Integer limit) throws ExecutionException, InterruptedException {
    return personReaderServiceAsync.getAllPersonsByPageAsync(page, limit).get();
  }

  public Persons getPersonById(Long id) throws ExecutionException, InterruptedException {
    return personReaderServiceAsync.getPersonByIdAsync(id).get();
  }
}
