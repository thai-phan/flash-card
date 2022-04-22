package dict.service;

import dict.entity.DictionaryEntity;

import java.util.List;

public interface EmployeeService {
    List<DictionaryEntity> getAllEmployees();
    List<String> getString();
    DictionaryEntity getEmployeeByName(String name);
}
