package dev.hvdang.web.web.stockgame.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity(name = "BOOK")
public class Book {
  @Id
  @GeneratedValue
  private long id;
  private String title;
  private String author;
}
