package dict.service;

import dict.entity.MerriamWebsterEntity;

import java.util.List;

public interface EmployeeService {
    List<MerriamWebsterEntity> getAllEmployees();
    List<String> getString();
    MerriamWebsterEntity getEmployeeByName(String name);
}
