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
    String view = String.format("%s/%s", CONTEXT_VIEW, "StockGame");
    model.addAttribute("view", view);
    return view;
  }

  @GetMapping({"/createRoom"})
  public String createRoom(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "createRoom");
    model.addAttribute("view", view);
    return view;
  }

  @GetMapping({"/joinPlayer"})
  public String joinPlayer(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "joinPlayer");
    model.addAttribute("view", view);
    return view;
  }

  @GetMapping({"/playStock"})
  public String playStock(Model model) {
    String view = String.format("%s/%s", CONTEXT_VIEW, "playStock");
    model.addAttribute("view", view);
    return view;
  }

}
