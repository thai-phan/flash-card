package dict.repository;

import dict.entity.DictionaryEntity;
import dict.entity.WordTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordTimeRepository extends JpaRepository<WordTimeEntity, Long> {

    List<WordTimeEntity> findById(String id);
}
