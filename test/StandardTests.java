import com.sci.festival.FestivalGate;
import com.sci.festival.TicketType;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StandardTests {

    public class MyTests{

        @Test
        void GateTest(){
            FestivalGate gate = new FestivalGate();
            gate.addTicket(TicketType.freePass);
            gate.addTicket(TicketType.oneDay);
            int totalTickets = 2;
            int freeTickets = 1;
            int dayTickets = 1;

            assertEquals(totalTickets,gate.getCountAll());
            assertEquals(freeTickets,gate.getCountFree());
            assertEquals(dayTickets,gate.getCountOneDay());

        }



    }
}
