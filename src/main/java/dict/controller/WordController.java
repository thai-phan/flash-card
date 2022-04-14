package dict.controller;


import dict.entity.MerriamWebsterEntity;
import dict.repository.MerriamWebsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class WordController {

    @Autowired
    MerriamWebsterRepository merriamWebsterRepository;

    @GetMapping("/search/{word}")
    public List<MerriamWebsterEntity> getWord(@PathVariable String word) {
        return merriamWebsterRepository.selectByWord(word);
    }
}
