package dict.service;

import dict.entity.DictionaryEntity;
import dict.repository.DictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private DictionaryRepository employeeRepository;

    @Override
    public List<DictionaryEntity> getAllEmployees() {
        return null;
    }

    @Override
    public List<String> getString() {
        return null;
    }

    @Override
    public DictionaryEntity getEmployeeByName(String name) {
        return null;
    }
}