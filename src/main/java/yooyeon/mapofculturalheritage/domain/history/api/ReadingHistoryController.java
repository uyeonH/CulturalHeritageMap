package yooyeon.mapofculturalheritage.domain.history.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yooyeon.mapofculturalheritage.domain.heritage.domain.Heritage;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/api")
public class ReadingHistoryController {
    @PostMapping("keyword")
    public List<Heritage> getKeyword() {
        return null;
    }

    @GetMapping(value = "heritage/getHeritageList")
    public List<Heritage> getHeritageList() {
        return null;
    }
}
