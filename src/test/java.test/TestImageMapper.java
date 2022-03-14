
import com.amr.project.converter.mappers.CityMapper;

import com.amr.project.converter.mappers.UserMapper;
import com.amr.project.converter.mappers.UserMapperImpl;
import com.amr.project.converter.sets.ItemSetMapper;
import com.amr.project.converter.sets.ItemSetMapperImpl;
import com.amr.project.converter.sets.UserSetMapper;
import com.amr.project.converter.sets.UserSetMapperImpl;
import com.amr.project.model.dto.CityDTO;
import com.amr.project.model.entity.City;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
public class TestImageMapper {

  /*  private final ItemSetMapper itemSetMapper = new ItemSetMapperImpl();

   private final UserSetMapper userSetMapper = new UserSetMapperImpl();

   private final UserMapper userMapper = new UserMapperImpl();


    @Test
    public void givenUserDoesNotExists_whenUserInfoIsRetrieved_then404IsReceived()
            throws ClientProtocolException, IOException {

        // Given
        String name = "name";
        HttpUriRequest request = new HttpGet( "https://shop/{idShop}/items" );

        // When
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

        // Then
        assertThat(
                httpResponse.getStatusLine().getStatusCode(),
                equalTo(HttpStatus.SC_NOT_FOUND));
    }


    @Test
    public void shouldMapCityToDto() {
        City city = new City(1L);

        CityDTO cityDTO = CityMapper.INSTANCE.toDTO(city);

        Assertions.assertNotNull(cityDTO);
        Assertions.assertEquals(city.getId(), cityDTO.getId());
        Assertions.assertEquals(city.getName(), cityDTO.getName());

    }*/
}
