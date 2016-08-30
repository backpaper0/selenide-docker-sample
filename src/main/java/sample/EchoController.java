package sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EchoController {

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("post")
    public String post(@RequestParam String content, RedirectAttributes model) {
        model.addFlashAttribute("echo", content);
        return "redirect:/";
    }
}
