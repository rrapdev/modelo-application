package br.com.modelo.service.mapper;

import br.com.modelo.domain.Country;
import br.com.modelo.domain.Region;
import br.com.modelo.service.dto.CountryDTO;
import br.com.modelo.service.dto.RegionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Country} and its DTO {@link CountryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CountryMapper extends EntityMapper<CountryDTO, Country> {
    @Mapping(target = "region", source = "region", qualifiedByName = "regionId")
    CountryDTO toDto(Country s);

    @Named("regionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RegionDTO toDtoRegionId(Region region);
}
