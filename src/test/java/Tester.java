import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tester {

    @Test
    @DisplayName("Does 3+4 = 7?")
    public void testAdd(){
        assertEquals(7, Tested.add(3, 4));
    }

}
