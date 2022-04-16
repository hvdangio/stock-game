package dev.hvdang.web.web.stockgame.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


//REF: https://www.baeldung.com/thymeleaf-list
@Data
public class BooksForm {
  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    this.books.add(book);
  }
}
