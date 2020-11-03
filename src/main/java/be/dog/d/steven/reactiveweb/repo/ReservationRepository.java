package be.dog.d.steven.reactiveweb.repo;

import be.dog.d.steven.reactiveweb.model.Reservation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReservationRepository extends ReactiveCrudRepository<Reservation, String> {

}
