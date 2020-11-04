import org.apache.http.HttpStatus
import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.MediaType

Contract.make {

    description("should return all Reservations")

    request {
        method("GET")
        url("/reservations")
    }

    response {
        status(HttpStatus.SC_OK)
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
        }
        body([[id: "1", name: "Jane"]])
    }
}