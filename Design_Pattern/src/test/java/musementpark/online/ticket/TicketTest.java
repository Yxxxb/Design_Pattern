package musementpark.online.ticket;


import musementpark.util.Print;
import musementpark.util.PrintInfo;
import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void testTicket() {
        Print.print(
                new PrintInfo(
                        "classname",
                        "objectId",
                        "methodname",
                        "description"
                )
        );
        Pticket pticket =new ProxyTicket(2);
        pticket.display();
    }
}
