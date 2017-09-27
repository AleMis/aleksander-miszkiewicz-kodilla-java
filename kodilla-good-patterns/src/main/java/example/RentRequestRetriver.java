package example;

import java.time.LocalDateTime;

public class RentRequestRetriver {

    public RentRequest retrive() {
        User user = new User("Jan", "Nowak");

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
