package dict.repository;

import dict.entity.DictionaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictionaryRepository extends JpaRepository<DictionaryEntity, Long> {

    @Query(value = "select * from dictionary mw where target LIKE %?1% limit 10", nativeQuery = true)
    List<DictionaryEntity> selectByWord(String word);


//    List<Map<String, Object>> selectAll();
}
