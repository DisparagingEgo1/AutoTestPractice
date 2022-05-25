import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tester2 {
    @Test
    @DisplayName("5-2==3")
    public void subtractTest(){
        assertEquals(3,Tested.subtract(5,2));
    }
}
