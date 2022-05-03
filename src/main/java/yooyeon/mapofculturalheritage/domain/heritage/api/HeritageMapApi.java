package yooyeon.mapofculturalheritage.domain.heritage.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import yooyeon.mapofculturalheritage.domain.heritage.domain.Heritage;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HeritageMapApi {


    @GetMapping("map")
    public String kakaoMap(Model model) {
        return "kakao-map";
    }

    @GetMapping(value = "/heritageList")
    public @ResponseBody
    String getPositionData() {
        return "";
    }

    // desc 시대 이름 정보 가져옴
    @ResponseBody
    @PostMapping(value = "getCcce")
    public void getCcce(String ccce) {

    }

    // desc 현재 위치 반환
    @ResponseBody
    @PostMapping(value = "getCurPos")
    public String getPosition() {
        return "";
    }

    @ResponseBody
    @PostMapping(value = "getCurPosInBackground")
    public String getCurPostBackground() {
        return "";

    }

    // desc 시대별 버튼 눌렀을 때 해당 데이터 반환
    @GetMapping(value = "displayByCcce")
    public @ResponseBody
    List<Heritage> displayByCcceName() {
        return null;
    }
}