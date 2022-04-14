package dict.repository;

import dict.entity.MerriamWebsterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MerriamWebsterRepository extends JpaRepository<MerriamWebsterEntity, Long> {


    @Query(value = "select * from merriam_webster mw where target LIKE %?1% limit 10", nativeQuery = true)
    List<MerriamWebsterEntity> selectByWord(String word);

//    List<Map<String, Object>> selectAll();
}
