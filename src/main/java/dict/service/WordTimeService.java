package dict.service;

import dict.entity.WordTimeEntity;
import dict.repository.WordTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class WordTimeService {

    @Autowired
    WordTimeRepository wordTimeRepository;

    public Boolean checkWordTimeStatus(Map<String, Object> data) {
        String wordTimeId = data.get("userId") + "-" + data.get("wordId");
        List<WordTimeEntity> entity = wordTimeRepository.findById(wordTimeId);
        return !entity.isEmpty();
    }


    public WordTimeEntity insertNewWordTime(Map<String, Object> data) {
        WordTimeEntity wordTime = new WordTimeEntity();
        try {
            wordTime.setId(data.get("userId") + "-" + data.get("wordId"));
            wordTime.setWordId((Integer) data.get("wordId"));
            wordTime.setUserId((Integer) data.get("userId"));
            wordTime.setAcknowledgeTime(LocalDateTime.now());
            //        wordTime.setUpdate(true);
            wordTimeRepository.save(wordTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        wordTimeRepository.flush();
        return wordTime;
    }

    public Boolean deleteNewWordTime(Map<String, Object> data) {
        String wordTimeId = data.get("userId") + "-" + data.get("wordId");
        List<WordTimeEntity> entity = wordTimeRepository.findById(wordTimeId);
        wordTimeRepository.delete(entity.get(0));
        return true;
    }
}
