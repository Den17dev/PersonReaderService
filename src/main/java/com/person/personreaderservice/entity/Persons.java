package com.person.personreaderservice.entity;

import lombok.Data;
@Data
public class Persons {

  private Long person_id;

  private String last_name;

  private String first_name;

  private String address;
}
