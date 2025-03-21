package springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
