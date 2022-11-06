package br.com.modelo.service.mapper;

import br.com.modelo.domain.Task;
import br.com.modelo.service.dto.TaskDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
