package be.dog.d.steven.reactiveweb;

import be.dog.d.steven.reactiveweb.model.Reservation;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReservationPojoTest {

    @Test
    public void creat() throws Exception {
        Reservation r = new Reservation("Jane","1");
        Assert.assertEquals(r.getId(), "1");
        Assert.assertEquals(r.getName(), "Jane");
    }
}
