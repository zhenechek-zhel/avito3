import com.amr.project.converter.lists.ItemSetMapper;
import com.amr.project.converter.lists.UserSetMapper;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;

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
