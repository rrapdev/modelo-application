package br.com.modelo.service.mapper;

import br.com.modelo.domain.Department;
import br.com.modelo.domain.Employee;
import br.com.modelo.service.dto.DepartmentDTO;
import br.com.modelo.service.dto.EmployeeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Employee} and its DTO {@link EmployeeDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper extends EntityMapper<EmployeeDTO, Employee> {
    @Mapping(target = "manager", source = "manager", qualifiedByName = "employeeId")
    @Mapping(target = "department", source = "department", qualifiedByName = "departmentId")
    EmployeeDTO toDto(Employee s);

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);

    @Named("departmentId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DepartmentDTO toDtoDepartmentId(Department department);
}
