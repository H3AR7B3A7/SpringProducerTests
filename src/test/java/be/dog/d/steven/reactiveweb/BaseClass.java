package be.dog.d.steven.reactiveweb;

import be.dog.d.steven.reactiveweb.model.Reservation;
import be.dog.d.steven.reactiveweb.repo.ReservationConfiguration;
import be.dog.d.steven.reactiveweb.repo.ReservationRepository;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;

@Import(ReservationConfiguration.class)
@SpringBootTest(properties = "server.port=0",
webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class BaseClass {

    @MockBean
    private ReservationRepository reservationRepository;

    @LocalServerPort
    private int port;

    @Before
    public void before(){

        RestAssured.baseURI = "http://localhost:" + this.port;

        Mockito.when(this.reservationRepository.findAll())
                .thenReturn(Flux.just(new Reservation("Jane", "1")));

    }
}
