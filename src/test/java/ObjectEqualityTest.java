import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectEqualityTest {
    @Test
    public void testStringObjectAgainstIntegerObject(){
        Integer number = 77;
        Integer number2 = 77;
        ObjectEquality objectEquality = new ObjectEquality();
        objectEquality.equals(number);
        assertEquals(number2, number);
    }

    @Test
    public void testFloatObjectAgainstIntegerObject(){
        Float number = 23f;
        Integer number2 = 23;
        ObjectEquality objectEquality = new ObjectEquality();
        objectEquality.equals(number);
        assertEquals(number2, number);
    }
}