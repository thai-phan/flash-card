package dict.controller;


import dict.entity.DictionaryEntity;
import dict.entity.WordTimeEntity;
import dict.repository.DictionaryRepository;
import dict.service.WordTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class WordController {

    @Autowired
    DictionaryRepository dictionaryRepository;

    @Autowired
    WordTimeService wordTimeService;


    @GetMapping("/search/{word}")
    public List<DictionaryEntity> getWord(@PathVariable String word) {
        return dictionaryRepository.selectByWord(word);
    }

    @PostMapping("/check-word-time-status")
    public Boolean checkWordTimeStatus(@RequestBody Map<String, Object> data) {
        return wordTimeService.checkWordTimeStatus(data);
    }

    @PostMapping("/remember-word-time")
    public WordTimeEntity insertNewWordTime(@RequestBody Map<String, Object> data) {
        return wordTimeService.insertNewWordTime(data);
    }

    @PostMapping("/delete-word-time")
    public Boolean deleteNewWordTime(@RequestBody Map<String, Object> data) {
        return wordTimeService.deleteNewWordTime(data);
    }
}
