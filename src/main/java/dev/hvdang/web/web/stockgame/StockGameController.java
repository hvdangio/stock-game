package dev.hvdang.web.web.stockgame;

import dev.hvdang.web.web.stockgame.dto.Book;
import dev.hvdang.web.web.stockgame.dto.BooksForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static dev.hvdang.web.sbwebbase.SBWEB_CONFIG.CONTEXT_URL_WEB_PAGE;


@Controller
@RequestMapping(value = StockGameController.CONTEXT_URL)
public class StockGameController {
  public static final String CONTEXT_URL = CONTEXT_URL_WEB_PAGE + "/stockgame";
  public static final String CONTEXT_VIEW = CONTEXT_URL.substring(1); //ignore "/"

  @Autowired
  private BookRepository bookService;

  //-------------
  @GetMapping({"", "/"})
  public String mainPage(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "StockGame");
    model.addAttribute("view", view);
    return view;
  }

  @GetMapping({"/createGame"})
  public String createGame(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "createGame");
    model.addAttribute("view", view);
    return view;
  }

  //--------------
  @GetMapping({"/addPlayer"})
  public String getPlayer(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "addPlayer");
    model.addAttribute("view", view);

    model.addAttribute("books", bookService.findAll());

    BooksForm booksForm = new BooksForm();
    for (int i = 1; i <= 3; i++) {
      booksForm.addBook(new Book());
    }
    model.addAttribute("form", booksForm);
    return view;
  }

  @PostMapping("/addPlayer")
  public String saveBooks(@ModelAttribute BooksForm form, Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "addPlayer");
    model.addAttribute("view", view);

    bookService.saveAll(form.getBooks());
    model.addAttribute("books", bookService.findAll());
    return "redirect:/" + view;
//    return "redirect:/books/all";
  }

  //--------------
  @GetMapping({"/playStock"})
  public String playStock(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "playStock");
    model.addAttribute("view", view);
    return view;
  }

}
