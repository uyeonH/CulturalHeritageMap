package yooyeon.mapofculturalheritage.domain.heritage.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HeritageApi {
    @GetMapping("/heritages")
    public String list(Model model) {
        return "heritage-list";
    }
}
