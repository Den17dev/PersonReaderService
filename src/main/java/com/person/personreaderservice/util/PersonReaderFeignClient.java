package com.person.personreaderservice.util;

import com.person.personreaderservice.entity.Persons;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "feignClient", url = "http://localhost:8081/mariadb")
public interface PersonReaderFeignClient {

  //Method with some value
  @GetMapping("/persons")
  List<Persons> getAllPersonsByPage(@RequestParam(defaultValue = "0") int pageNum, @RequestParam(defaultValue = "100") int limit);

  //Method with some value
  @GetMapping("/persons/{id}")
  Persons getPersonById(@PathVariable(value = "id") Long id);

}