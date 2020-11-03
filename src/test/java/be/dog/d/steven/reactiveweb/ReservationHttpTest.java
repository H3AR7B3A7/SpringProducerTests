package be.dog.d.steven.reactiveweb;

import be.dog.d.steven.reactiveweb.model.Reservation;
import be.dog.d.steven.reactiveweb.repo.ReservationConfiguration;
import be.dog.d.steven.reactiveweb.repo.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;

@WebFluxTest
@Import(ReservationConfiguration.class)
@RunWith(SpringRunner.class)
public class ReservationHttpTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private ReservationRepository reservationRepository;

    @Test
    public void get() throws Exception {

        Mockito.when(this.reservationRepository.findAll())
                .thenReturn(Flux.just(new Reservation("Jane", "1")));

        this.webTestClient
                .get()
                .uri("http://localhost:8080/reservations")
                .exchange()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectStatus().isOk()
                .expectBody().jsonPath("@.[0].name", "Jane").exists();
    }
}
