import com.amr.project.converter.CityMapper;
import com.amr.project.converter.ImageMapper;
import com.amr.project.converter.ItemMapper;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.dto.ItemDTO;
import com.amr.project.model.entity.City;
import com.amr.project.model.entity.Item;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestImageMapper {

    @Autowired
    private CityMapper mapperUnderTest;




    @Test
    void shouldProperlyMapModelToDto() {
        //given
        City model = new City();
        model.setId(11L);
        model.setName("Item name");

        //when
        CityDTO dto = mapperUnderTest.toDTO(model);

        //then
        Assertions.assertNotNull(dto);
        Assertions.assertEquals(model.getId(), dto.getId());
        Assertions.assertEquals(model.getName(), dto.getName());
    }
}
