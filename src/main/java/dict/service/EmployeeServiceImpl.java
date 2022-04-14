package dict.service;

import dict.entity.MerriamWebsterEntity;
import dict.repository.MerriamWebsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private MerriamWebsterRepository employeeRepository;

    @Override
    public List<MerriamWebsterEntity> getAllEmployees() {
        return null;
    }

    @Override
    public List<String> getString() {
        return null;
    }

    @Override
    public MerriamWebsterEntity getEmployeeByName(String name) {
        return null;
    }
}