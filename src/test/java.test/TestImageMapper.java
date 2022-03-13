
import com.amr.project.converter.mappers.CityMapper;
import com.amr.project.converter.mappers.CityMapperImpl;
import com.amr.project.model.dto.CityDTO;

import com.amr.project.model.entity.City;

import com.amr.project.model.entity.Country;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestImageMapper {




//    @Test
//    public void shouldProperlyMapModelToDto() {
//        //given
//        City model = new City();
//        model.setId(11L);
//        model.setName("City name");
//
//        //when
//        CityDTO dto = mapperUnderTest.toDTO(model);
//
//        //then
//        Assertions.assertNotNull(dto);
//        Assertions.assertEquals(model.getId(), dto.getId());
//        Assertions.assertEquals(model.getName(), dto.getName());
//    }


    @Test
    public void shouldMapCityToDto() {
        City city = new City(1L);

        CityDTO cityDTO = CityMapper.INSTANCE.toDTO(city);

        Assertions.assertNotNull(cityDTO);
        Assertions.assertEquals(city.getId(), cityDTO.getId());
        Assertions.assertEquals(city.getName(), cityDTO.getName());

    }
}
