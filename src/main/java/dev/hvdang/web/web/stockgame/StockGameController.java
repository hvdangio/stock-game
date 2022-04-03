package dev.hvdang.web.web.stockgame;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static dev.hvdang.web.sbwebbase.SBWEB_CONFIG.CONTEXT_URL_WEB_PAGE;


@Controller
@RequestMapping(value = StockGameController.CONTEXT_URL)
public class StockGameController {
  public static final String CONTEXT_URL = CONTEXT_URL_WEB_PAGE + "/stockgame";
  public static final String CONTEXT_VIEW = CONTEXT_URL.substring(1); //ignore "/"

  @GetMapping({"", "/"})
  public String mainPage(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "StockGame"); //view
  }

  @GetMapping({"/createRoom"})
  public String createRoom(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "createRoom"); //view
  }

  @GetMapping({"/joinPlayer"})
  public String joinPlayer(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "joinPlayer"); //view
  }

  @GetMapping({"/playStock"})
  public String playStock(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "playStock"); //view
  }

}
