package be.dog.d.steven.reactiveweb.repo;

import be.dog.d.steven.reactiveweb.model.Reservation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.*;

@Configuration
public class ReservationConfiguration {

    @Bean
    RouterFunction<ServerResponse> routes(ReservationRepository reservationRepository){
        return route()
                .GET("/reservations", r -> ok().body(reservationRepository.findAll(), Reservation.class))
                .build();
    }
}
