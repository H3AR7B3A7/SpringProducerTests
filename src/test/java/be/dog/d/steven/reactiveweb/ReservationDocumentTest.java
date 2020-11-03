package be.dog.d.steven.reactiveweb;

import be.dog.d.steven.reactiveweb.model.Reservation;
import be.dog.d.steven.reactiveweb.repo.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@DataMongoTest
@RunWith(SpringRunner.class)
public class ReservationDocumentTest {

    @Autowired
    private ReservationRepository reservationRepository;

    @Test
    public void persist() throws Exception {

        Reservation reservation = new Reservation("Jane",null);
        Mono<Reservation> save = this.reservationRepository.save(reservation);
        StepVerifier
                .create(save)
                .expectNextMatches(r -> r.getId() != null && r.getName().equalsIgnoreCase("Jane"))
                .verifyComplete();

    }
}
