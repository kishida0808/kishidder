package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tweet {
  @Id
  @GeneratedValue
  private Long id;

  @NotBlank
  @Size(max = 120)
  private String content;

}
