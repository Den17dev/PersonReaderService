package com.person.personreaderservice.service;


import com.person.personreaderservice.entity.Persons;
import com.person.personreaderservice.util.PersonReaderFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
public class PersonReaderServiceAsync {

  private final PersonReaderFeignClient personReaderFeignClient;
  @Async
  public CompletableFuture<List<Persons>> getAllPersonsByPageAsync(Integer page, Integer limit) throws InterruptedException {
    System.out.println("In thread " + Thread.currentThread().getName());
    Thread.sleep(2000);
    return CompletableFuture.completedFuture(personReaderFeignClient.getAllPersonsByPage(page, limit));
  }

  @Async
  public CompletableFuture<Persons> getPersonByIdAsync(Long id) throws InterruptedException {
    System.out.println("In thread " + Thread.currentThread().getName());
    Thread.sleep(2000);
    return CompletableFuture.completedFuture(personReaderFeignClient.getPersonById(id));
  }









}