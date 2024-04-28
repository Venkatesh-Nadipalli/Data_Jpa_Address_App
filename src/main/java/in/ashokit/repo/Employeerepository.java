package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface Employeerepository extends CrudRepository<Employee,Integer> {

}
